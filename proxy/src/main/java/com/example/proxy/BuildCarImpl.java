package com.example.proxy;

public class BuildCarImpl implements BuildCar {

    public BuildCarImpl() {
        informManager();
    }

    @Override
    public void buildGlass() {
        System.out.println("Build glass ...");
    }

    @Override
    public void buildDor() {
        System.out.println("Build dor ...");
    }

    private void informManager(){
        System.out.println("Inform manager about started work on building car");
    }
}
