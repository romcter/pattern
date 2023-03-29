package com.example.saga.choreography;


/**
 * ChoreographyChapter is an interface representing a contract for an external service. In that
 * case, a service needs to make a decision what to do further hence the server needs to get all
 * context representing {@link Saga}
 */
public interface ChoreographyChapter {

    Saga execute(Saga saga);
    String getName();
    Saga process(Saga saga);
    Saga rollback(Saga saga);
}
