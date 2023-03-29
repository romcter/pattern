package com.example.saga.choreography;

public class OrderIphoneService extends Service {

    public OrderIphoneService(ServiceDiscoveryService service) {
        super(service);
    }

    @Override
    public String getName() {
        return "order Iphone";
    }
}
