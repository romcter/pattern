package abstractFactory.kia;

import abstractFactory.Selling;

public class KiaSelling implements Selling {
    @Override
    public void sell() {
        System.out.println("KIA sell ...");
    }
}
