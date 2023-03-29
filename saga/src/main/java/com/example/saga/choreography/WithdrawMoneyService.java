package com.example.saga.choreography;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WithdrawMoneyService extends Service {

    public WithdrawMoneyService(ServiceDiscoveryService service){
        super(service);
    }

    @Override
    public String getName() {
        return "withdrawing money";
    }

    @Override
    public Saga process(Saga saga) {
        Object inValue = saga.getCurrentValue();

        if (inValue.equals("bad_order")) {
            log.info("The chapter '{}' has been started. But the exception has been raised."
                            + "The rollback is about to start",
                    getName(), inValue);
            saga.setCurrentStatus(ChapterResult.ROLLBACK);
            return saga;
        }
        return super.process(saga);
    }
}
