package com.example.saga.choreography;

public class StayInLineService extends Service {

    public StayInLineService(ServiceDiscoveryService service) {
        super(service);
    }

    @Override
    public String getName() {
        return "Stay in line to your Iphone";
    }
}
