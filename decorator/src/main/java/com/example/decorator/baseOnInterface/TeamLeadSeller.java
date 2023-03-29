package com.example.decorator.baseOnInterface;

public class TeamLeadSeller implements Seller {

    @Override
    public void sale() {
        System.out.println("Team lead leading command ...");
    }
}
