package com.example.decorator.baseOnAbstractClass.bulldozer;

import com.example.decorator.baseOnAbstractClass.MotorizedMachine;

public abstract class BulldozerDecorator extends MotorizedMachine {

    MotorizedMachine motorizedMachine;

    public BulldozerDecorator(MotorizedMachine motorizedMachine) {
        this.motorizedMachine = motorizedMachine;
    }

    @Override
    public void doJob() {
        motorizedMachine.doJob();
    }
}
