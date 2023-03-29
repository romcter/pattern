package com.example.proxy;

import java.util.Objects;

public class BuildCarProxy implements BuildCar {

    private BuildCar buildCar;

    @Override
    public void buildGlass() {
        initializationBuildCarIfNull();
        this.buildCar.buildGlass();
    }

    @Override
    public void buildDor() {
        initializationBuildCarIfNull();
        this.buildCar.buildDor();
    }

    private void initializationBuildCarIfNull(){
        if (Objects.isNull(this.buildCar))
            this.buildCar = new BuildCarImpl();
    }
}
