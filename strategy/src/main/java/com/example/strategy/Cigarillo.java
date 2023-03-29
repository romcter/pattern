package com.example.strategy;

public class Cigarillo implements Smoking {

    @Override
    public void smoke() {
        System.out.println("Smoke cigarillo ...");
    }
}
