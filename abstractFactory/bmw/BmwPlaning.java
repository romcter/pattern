package abstractFactory.bmw;

import abstractFactory.Planing;

public class BmwPlaning implements Planing {
    @Override
    public void plan() {
        System.out.println("BMW plan ... ");
    }
}
