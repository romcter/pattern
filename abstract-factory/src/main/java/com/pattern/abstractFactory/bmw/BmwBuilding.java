package com.pattern.abstractFactory.bmw;

import com.pattern.abstractFactory.Building;

public class BmwBuilding implements Building {
    @Override
    public void build() {
        System.out.println("BMW building ...");
    }
}
