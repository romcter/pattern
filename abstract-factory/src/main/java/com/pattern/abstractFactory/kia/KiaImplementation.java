package com.pattern.abstractFactory.kia;

import com.pattern.abstractFactory.Implementation;

public class KiaImplementation implements Implementation {
    @Override
    public void implement() {
        System.out.println("KIA implement ...");
    }
}
