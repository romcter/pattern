package com.pattern.abstractFactory.bmw;

import com.pattern.abstractFactory.Implementation;

public class BmwImplementation implements Implementation {
    @Override
    public void implement() {
        System.out.println("BMW implement ...");
    }
}
