package abstractFactory.kia;

import abstractFactory.*;

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
