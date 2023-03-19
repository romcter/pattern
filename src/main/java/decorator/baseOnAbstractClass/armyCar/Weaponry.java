package decorator.baseOnAbstractClass.armyCar;

import decorator.baseOnAbstractClass.MotorizedMachine;

public class Weaponry extends ArmyCarDecorator {

    public Weaponry(MotorizedMachine motorizedMachine) {
        super(motorizedMachine);
    }

    @Override
    public void doJob() {
        super.doJob();
        equipWeaponry();
    }

    private void equipWeaponry(){
        System.out.println("Equip weaponry ...");
    }
}
