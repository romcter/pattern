package abstractFactory.kia;

import abstractFactory.Implementation;

public class KiaImplementation implements Implementation {
    @Override
    public void implement() {
        System.out.println("KIA implement ...");
    }
}
