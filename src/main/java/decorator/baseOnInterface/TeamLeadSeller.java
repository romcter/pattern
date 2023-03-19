package decorator.baseOnInterface;

import decorator.baseOnInterface.Seller;

public class TeamLeadSeller implements Seller {

    @Override
    public void sale() {
        System.out.println("Team lead leading command ...");
    }
}
