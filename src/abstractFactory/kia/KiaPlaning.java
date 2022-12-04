package abstractFactory.kia;

import abstractFactory.Planing;

public class KiaPlaning implements Planing {
    @Override
    public void plan() {
        System.out.println("KIA plan ... ");
    }
}
