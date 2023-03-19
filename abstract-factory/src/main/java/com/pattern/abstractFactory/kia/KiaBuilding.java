package com.pattern.abstractFactory.kia;

import com.pattern.abstractFactory.Building;

public class KiaBuilding implements Building {
    @Override
    public void build() {
        System.out.println("KIA building ...");
    }
}
