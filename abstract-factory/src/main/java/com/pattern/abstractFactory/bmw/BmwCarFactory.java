package com.pattern.abstractFactory.bmw;

import com.pattern.abstractFactory.Building;
import com.pattern.abstractFactory.CarFactory;
import com.pattern.abstractFactory.Implementation;
import com.pattern.abstractFactory.Planing;
import com.pattern.abstractFactory.Testing;
import com.pattern.abstractFactory.Selling;

public class BmwCarFactory implements CarFactory {

    @Override
    public Planing getPlaning() {
        return new BmwPlaning();
    }

    @Override
    public Implementation getImplementation() {
        return new BmwImplementation();
    }

    @Override
    public Building getBuilding() {
        return new BmwBuilding();
    }

    @Override
    public Testing getTesting() {
        return new BmwTesting();
    }

    @Override
    public Selling getSelling() {
        return new BmwSelling();
    }
}
