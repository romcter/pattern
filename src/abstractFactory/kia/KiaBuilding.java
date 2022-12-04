package abstractFactory.kia;

import abstractFactory.Building;

public class KiaBuilding implements Building {
    @Override
    public void build() {
        System.out.println("KIA building ...");
    }
}
