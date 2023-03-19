package decorator.baseOnAbstractClass.armyCar;

import decorator.baseOnAbstractClass.MotorizedMachine;

public class Armour extends ArmyCarDecorator {

    public Armour(MotorizedMachine motorizedMachine) {
        super(motorizedMachine);
    }

    @Override
    public void doJob() {
        super.doJob();
        protectedByArmour();
    }

    private void protectedByArmour(){
        System.out.println("Protected car by armour ...");
    }
}
