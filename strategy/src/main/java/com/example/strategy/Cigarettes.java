package com.example.strategy;

public class Cigarettes implements Smoking{

    @Override
    public void smoke() {
        System.out.println("Smoke cigarettes ...");
    }
}
