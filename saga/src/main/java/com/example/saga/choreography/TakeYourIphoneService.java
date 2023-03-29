package com.example.saga.choreography;

public class TakeYourIphoneService extends Service {

    public TakeYourIphoneService(ServiceDiscoveryService service) {
        super(service);
    }

    @Override
    public String getName() {
        return "Take yor Iphone";
    }
}
