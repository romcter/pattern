package com.example.saga.orchestration;

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
 * <p>In this approach, there is an orchestrator @see {@link SagaOrchestrator}
 * that manages all the transactions and directs the participant services to execute local
 * transactions based on events. The major difference with choreography saga is an ability to handle
 * crashed services (otherwise in choreography services very hard to prevent a saga if one of them
 * has been crashed)
 *
 * @see Saga
 * @see SagaOrchestrator
 * @see Service
 */
@Slf4j
public class Runner {

    public static void main(String[] args) {
        SagaOrchestrator sagaOrchestrator = new SagaOrchestrator(newSaga(), serviceDiscovery());

        Saga.Result goodOrder = sagaOrchestrator.execute("good_order");
        Saga.Result badOrder = sagaOrchestrator.execute("bad_order");
        Saga.Result crashedOrder = sagaOrchestrator.execute("crashed_order");

        log.info("orders: goodOrder is {}, badOrder is {},crashedOrder is {}",
                goodOrder, badOrder, crashedOrder);
    }


    private static Saga newSaga() {
        return Saga
                .create()
                .chapter("order Iphone")
                .chapter("stay in line to your Iphone")
                .chapter("take yor Iphone")
                .chapter("withdrawing money");
    }

    private static ServiceDiscoveryService serviceDiscovery() {
        return new ServiceDiscoveryService()
                .discover(new OrderIphoneService())
                .discover(new StayInLineService())
                .discover(new TakeYourIphoneService())
                .discover(new WithdrawMoneyService());
    }
}
