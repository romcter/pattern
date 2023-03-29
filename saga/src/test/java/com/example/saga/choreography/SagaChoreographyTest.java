/*
 * This project is licensed under the MIT license. Module model-view-viewmodel is using ZK framework licensed under LGPL (see lgpl-3.0.txt).
 *
 * The MIT License
 * Copyright © 2014-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.example.saga.choreography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * test to check choreography saga
 */
class SagaChoreographyTest {

  @Test
  void executeTest() {
    ServiceDiscoveryService sd = serviceDiscovery();
    ChoreographyChapter service = sd.findAny();
    Saga badOrderSaga = service.execute(newSaga("bad_order"));
    Saga goodOrderSaga = service.execute(newSaga("good_order"));

    assertEquals(SagaResult.ROLLEDBACK, badOrderSaga.getResult());
    assertEquals(SagaResult.FINISHED, goodOrderSaga.getResult());
  }

  private static Saga newSaga(Object value) {
    return Saga
            .create()
            .chapter("order Iphone").setInValue(value)
            .chapter("Stay in line to your Iphone")
            .chapter("Take yor Iphone")
            .chapter("withdrawing money");
  }

  private static ServiceDiscoveryService serviceDiscovery() {
    ServiceDiscoveryService sd = new ServiceDiscoveryService();
    return sd
            .discover(new OrderIphoneService(sd))
            .discover(new StayInLineService(sd))
            .discover(new TakeYourIphoneService(sd))
            .discover(new WithdrawMoneyService(sd));
  }
}
