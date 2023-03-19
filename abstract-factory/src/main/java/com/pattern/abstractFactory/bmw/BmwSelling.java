package com.pattern.abstractFactory.bmw;

import com.pattern.abstractFactory.Selling;

public class BmwSelling implements Selling {
    @Override
    public void sell() {
        System.out.println("BMW sell ...");
    }
}
