package com.example.decorator.baseOnAbstractClass;

import com.example.decorator.baseOnAbstractClass.armyCar.Armour;
import com.example.decorator.baseOnAbstractClass.armyCar.ArmyCar;
import com.example.decorator.baseOnAbstractClass.bulldozer.Blade;
import com.example.decorator.baseOnAbstractClass.bulldozer.ContinuousTracks;
import com.example.decorator.baseOnAbstractClass.bulldozer.Bulldozer;
import com.example.decorator.baseOnAbstractClass.armyCar.Weaponry;

public class DecoratorRunner {
    public static void main(String[] args) {
        MotorizedMachine bulldozer = new ContinuousTracks(new Blade(new Bulldozer()));
        bulldozer.doJob();

        System.out.println("-----------------------------");

        MotorizedMachine armyCar = new Weaponry(new Armour(new ArmyCar()));
        armyCar.doJob();
    }
}
