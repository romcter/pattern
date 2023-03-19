package com.pattern.abstractFactory.kia;

import com.pattern.abstractFactory.Planing;

public class KiaPlaning implements Planing {
    @Override
    public void plan() {
        System.out.println("KIA plan ... ");
    }
}
