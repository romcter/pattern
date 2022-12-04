package abstractFactory.bmw;

import abstractFactory.Building;

public class BmwBuilding implements Building {
    @Override
    public void build() {
        System.out.println("BMW building ...");
    }
}
