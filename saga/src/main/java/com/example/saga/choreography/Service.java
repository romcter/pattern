package com.example.saga.choreography;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

@Slf4j
public abstract class Service implements ChoreographyChapter {

    private final ServiceDiscoveryService sd;
    public Service(ServiceDiscoveryService service) {
        this.sd = service;
    }

    @Override
    public Saga execute(Saga saga) {
        Saga nextSaga = saga;
        Object nextVal;
        String chapterName = saga.getCurrent().getName();
        if(chapterName.equals(getName())) {
            if(saga.isForward()){
                nextSaga = process(saga);
                nextVal = nextSaga.getCurrentValue();
                if(nextSaga.isCurrentSuccess()) {
                    nextSaga.forward();
                } else {
                    nextSaga.back();
                }
            } else {
                nextSaga = rollback(saga);
                nextVal = nextSaga.getCurrentValue();
                nextSaga.back();
            }

            if (isSagaFinished(saga)){
                return nextSaga;
            }

            nextSaga.setCurrentValue(nextVal);
        }
        Saga finalNextSaga = nextSaga;

        return sd.find(chapterName).map(ch -> ch.execute(finalNextSaga)).orElseThrow(serviceNotFoundException(chapterName));
    }

    private Supplier<RuntimeException> serviceNotFoundException(String chServiceName) {
        return () -> new RuntimeException(
                String.format("the service %s has not been found", chServiceName));
    }

    private boolean isSagaFinished(Saga saga) {
        if (!saga.isPresent()) {
            saga.setFinished(true);
            log.info(" the saga has been finished with {} status", saga.getResult());
            return true;
        }
        return false;
    }

    @Override
    public Saga process(Saga saga) {
        Object inValue = saga.getCurrentValue();
        log.info("The chapter '{}' has been started. "
                        + "The data {} has been stored or calculated successfully",
                getName(), inValue);
        saga.setCurrentStatus(ChapterResult.SUCCESS);
        saga.setCurrentValue(inValue);
        return saga;
    }

    @Override
    public Saga rollback(Saga saga) {
        Object inValue = saga.getCurrentValue();
        log.info("The Rollback for a chapter '{}' has been started. "
                        + "The data {} has been rolled back successfully",
                getName(), inValue);
        saga.setCurrentStatus(ChapterResult.ROLLBACK);
        saga.setCurrentValue(inValue);
        return saga;
    }


}
