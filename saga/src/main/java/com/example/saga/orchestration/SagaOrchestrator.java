package com.example.saga.orchestration;

import lombok.extern.slf4j.Slf4j;
import com.example.saga.orchestration.Saga.Result;
import com.example.saga.orchestration.Saga.Chapter;
import static com.example.saga.orchestration.Saga.Result.CRASHED;
import static com.example.saga.orchestration.Saga.Result.FINISHED;
import static com.example.saga.orchestration.Saga.Result.ROLLBACK;

import java.util.Optional;

@Slf4j
public class SagaOrchestrator {
  private final Saga saga;
  private final ServiceDiscoveryService sd;
  private final CurrentState state;


  public SagaOrchestrator(Saga saga, ServiceDiscoveryService sd) {
    this.saga = saga;
    this.sd = sd;
    this.state = new CurrentState();
  }

  public <K> Result execute(K value) {
    state.cleanUp();
    log.info(" The new saga is about to start");
    Result result = Result.FINISHED;
    K tempVal = value;

    while (true) {
      int next = state.current();
      Chapter ch = saga.get(next);
      Optional<OrchestrationChapter> srvOpt = sd.find(ch.name);

      if (srvOpt.isEmpty()) {
        state.directionToBack();
        state.back();
        continue;
      }

      OrchestrationChapter srv = srvOpt.get();

      if (state.isForward()) {
        var processRes = srv.process(tempVal);
        if (processRes.isSuccess()) {
          next = state.forward();
          tempVal = (K) processRes.getValue();
        } else {
          state.directionToBack();
        }
      } else {
        var rlRes = srv.rollback(tempVal);
        if (rlRes.isSuccess()) {
          next = state.back();
          tempVal = (K) rlRes.getValue();
        } else {
          result = CRASHED;
          next = state.back();
        }
      }


      if (!saga.isPresent(next)) {
        return state.isForward() ? FINISHED : result == CRASHED ? CRASHED : ROLLBACK;
      }
    }

  }


  private static class CurrentState {
    int currentNumber;
    boolean isForward;

    void cleanUp() {
      currentNumber = 0;
      isForward = true;
    }

    CurrentState() {
      this.currentNumber = 0;
      this.isForward = true;
    }


    boolean isForward() {
      return isForward;
    }

    void directionToBack() {
      isForward = false;
    }

    int forward() {
      return ++currentNumber;
    }

    int back() {
      return --currentNumber;
    }

    int current() {
      return currentNumber;
    }
  }

}
