package com.example.saga.choreography;

import lombok.extern.slf4j.Slf4j;

/**
 * This pattern is used in distributed services to perform a group of operations atomically. This is
 * an analog of transaction in a database but in terms of microservices architecture this is
 * executed in a distributed environment
 *
 * <p>A saga is a sequence of local transactions in a certain context.
 * If one transaction fails for some reason, the saga executes compensating transactions(rollbacks)
 * to undo the impact of the preceding transactions.
 *
 * <p>In this approach, there are no mediators or orchestrators services.
 * All chapters are handled and moved by services manually.
 *
 * <p>The major difference with choreography saga is an ability to handle crashed services
 * (otherwise in choreography services very hard to prevent a saga if one of them has been crashed)
 *
 * @see Saga
 * @see Service
 */
@Slf4j
public class Runner {

    public static void main(String[] args) {
        ServiceDiscoveryService sd = serviceDiscovery();
        ChoreographyChapter service = sd.findAny();
        Saga goodOrderSaga = service.execute(newSaga("good_order"));
        Saga badOrderSaga = service.execute(newSaga("bad_order"));
        log.info("orders: goodOrder is {}, badOrder is {}",
                goodOrderSaga.getResult(), badOrderSaga.getResult());

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
