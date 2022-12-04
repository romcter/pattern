package abstractFactory.bmw;

import abstractFactory.*;

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
