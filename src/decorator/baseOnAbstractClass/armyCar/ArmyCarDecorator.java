package decorator.baseOnAbstractClass.armyCar;

import decorator.baseOnAbstractClass.MotorizedMachine;

public abstract class ArmyCarDecorator extends MotorizedMachine {

    MotorizedMachine motorizedMachine;

    public ArmyCarDecorator(){

    }

    public ArmyCarDecorator(MotorizedMachine motorizedMachine) {
        this.motorizedMachine = motorizedMachine;
    }

    @Override
    public void doJob() {
        motorizedMachine.doJob();
    }
}
