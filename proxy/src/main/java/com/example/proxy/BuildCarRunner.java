package com.example.proxy;

public class BuildCarRunner {
    public static void main(String[] args) {
        BuildCar buildCar = new BuildCarProxy();
        buildCar.buildDor();
        buildCar.buildGlass();
    }
}
