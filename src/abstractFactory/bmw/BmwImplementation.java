package abstractFactory.bmw;

import abstractFactory.Implementation;

public class BmwImplementation implements Implementation {
    @Override
    public void implement() {
        System.out.println("BMW implement ...");
    }
}
