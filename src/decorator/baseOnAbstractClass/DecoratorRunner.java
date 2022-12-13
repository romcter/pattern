package decorator.baseOnAbstractClass;

import decorator.baseOnAbstractClass.bulldozer.Blade;
import decorator.baseOnAbstractClass.bulldozer.Bulldozer;
import decorator.baseOnAbstractClass.bulldozer.ContinuousTracks;
import decorator.baseOnAbstractClass.armyCar.Armour;
import decorator.baseOnAbstractClass.armyCar.ArmyCar;
import decorator.baseOnAbstractClass.armyCar.Weaponry;

public class DecoratorRunner {
    public static void main(String[] args) {
        MotorizedMachine bulldozer = new ContinuousTracks(new Blade(new Bulldozer()));
        bulldozer.doJob();

        System.out.println("-----------------------------");

        MotorizedMachine armyCar = new Weaponry(new Armour(new ArmyCar()));
        armyCar.doJob();
    }
}
