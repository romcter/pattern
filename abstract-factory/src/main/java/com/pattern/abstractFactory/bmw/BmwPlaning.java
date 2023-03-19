package com.pattern.abstractFactory.bmw;

import com.pattern.abstractFactory.Planing;

public class BmwPlaning implements Planing {
    @Override
    public void plan() {
        System.out.println("BMW plan ... ");
    }
}
