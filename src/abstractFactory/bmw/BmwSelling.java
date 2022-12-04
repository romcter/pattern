package abstractFactory.bmw;

import abstractFactory.Selling;

public class BmwSelling implements Selling {
    @Override
    public void sell() {
        System.out.println("BMW sell ...");
    }
}
