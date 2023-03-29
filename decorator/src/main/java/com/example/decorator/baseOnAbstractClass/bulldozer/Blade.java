package com.example.decorator.baseOnAbstractClass.bulldozer;

import com.example.decorator.baseOnAbstractClass.MotorizedMachine;

public class Blade extends BulldozerDecorator {

    public Blade(MotorizedMachine motorizedMachine) {
        super(motorizedMachine);
    }

    @Override
    public void doJob() {
        super.doJob();
        pushingMaterial();
    }

    private void pushingMaterial(){
        System.out.println("Pushing material to the front ...");
    }
}
