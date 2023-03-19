package com.pattern.abstractFactory.kia;

import com.pattern.abstractFactory.Building;
import com.pattern.abstractFactory.CarFactory;
import com.pattern.abstractFactory.Implementation;
import com.pattern.abstractFactory.Planing;
import com.pattern.abstractFactory.Testing;
import com.pattern.abstractFactory.Selling;

public class KiaCarFactory implements CarFactory {

    @Override
    public Planing getPlaning() {
        return new KiaPlaning();
    }

    @Override
    public Implementation getImplementation() {
        return new KiaImplementation();
    }

    @Override
    public Building getBuilding() {
        return new KiaBuilding();
    }

    @Override
    public Testing getTesting() {
        return new KiaTesting();
    }

    @Override
    public Selling getSelling() {
        return new KiaSelling();
    }
}
