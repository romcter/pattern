package com.example.observer;

import com.example.observer.generic.*;
import lombok.extern.slf4j.Slf4j;

/**
 * The Observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any
 * state changes, usually by calling one of their methods. It is mainly used to implement
 * distributed event handling systems. The Observer pattern is also a key part in the familiar
 * model–view–controller (MVC) architectural pattern. The Observer pattern is implemented in
 * numerous programming libraries and systems, including almost all GUI toolkits.
 *
 * <p>In this example {@link CarDetail} has a state that can be observed. The {@link CoWorkers} and {@link
 * Supervisor} register as observers and receive notifications when the {@link DetailType} changes.
 */
@Slf4j
public class Runner {

    public static void main(String[] args) {
        CarDetail cerDetails = new CarDetail();
        cerDetails.addObserver(new CoWorkers());
        cerDetails.addObserver(new Supervisor());

        cerDetails.finishDetail();
        cerDetails.finishDetail();
        cerDetails.finishDetail();
        cerDetails.finishDetail();


        // Generic observer
        log.info("-----Running generic version-----");

        GenDetail genDetail = new GenDetail();
        genDetail.addObserver(new GenCoWorkers());
        genDetail.addObserver(new GenSupervisor());

        genDetail.finishDetail();
        genDetail.finishDetail();
        genDetail.finishDetail();
        genDetail.finishDetail();
    }
}
