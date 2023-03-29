package com.example.decorator.baseOnInterface;

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
