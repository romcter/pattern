package com.example.strategy;

public class Cigar implements Smoking {

    @Override
    public void smoke() {
        System.out.println("Smoke cigar ...");
    }
}
