package com.example.decorator.baseOnAbstractClass.bulldozer;

import com.example.decorator.baseOnAbstractClass.MotorizedMachine;

public class ContinuousTracks extends BulldozerDecorator {

    public ContinuousTracks(MotorizedMachine motorizedMachine) {
        super(motorizedMachine);
    }

    @Override
    public void doJob() {
        super.doJob();
        continuousTracks();
    }

    private void continuousTracks() {
        System.out.println("Travels using continuous tracks ...");
    }
}
