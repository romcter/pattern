package com.pattern.abstractFactory;

public interface CarFactory {

    Planing getPlaning();
    Implementation getImplementation();
    Building getBuilding();
    Testing getTesting();
    Selling getSelling();
}
