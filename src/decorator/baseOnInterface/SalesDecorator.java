package decorator.baseOnInterface;

import decorator.baseOnInterface.Seller;

public class SalesDecorator implements Seller {

    Seller seller;

    public SalesDecorator(Seller seller) {
        this.seller = seller;
    }

    @Override
    public void sale() {
        seller.sale();
    }
}
