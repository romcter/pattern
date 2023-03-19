package com.pattern.abstractFactory;


import com.pattern.abstractFactory.bmw.BmwCarFactory;
import com.pattern.abstractFactory.kia.KiaCarFactory;

public class CarFactoryRunner {
    public static void main(String[] args) {
//        CarFactory carFactory = new BmwCarFactory();
        CarFactory carFactory = new KiaCarFactory();
        Planing planing = carFactory.getPlaning();
        Implementation implementation = carFactory.getImplementation();
        Building building = carFactory.getBuilding();
        Testing testing = carFactory.getTesting();
        Selling selling = carFactory.getSelling();

        planing.plan();
        implementation.implement();
        building.build();
        testing.test();
        selling.sell();
    }
}
