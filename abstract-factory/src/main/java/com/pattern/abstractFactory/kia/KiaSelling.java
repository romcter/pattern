package com.pattern.abstractFactory.kia;

import com.pattern.abstractFactory.Selling;

public class KiaSelling implements Selling {
    @Override
    public void sell() {
        System.out.println("KIA sell ...");
    }
}
