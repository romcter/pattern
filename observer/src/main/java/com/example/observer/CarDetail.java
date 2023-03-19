package com.example.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CarDetail {

    private DetailType currentDetail;
    private final List<CarDetailObserver> observers;

    public CarDetail() {
        observers = new ArrayList<>();
        currentDetail = DetailType.ENGINE;
    }

    public void addObserver(CarDetailObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(CarDetailObserver obs) {
        observers.remove(obs);
    }

    public void finishDetail() {
        DetailType[] enumValues = DetailType.values();
        currentDetail = enumValues[(currentDetail.ordinal() + 1) % enumValues.length];
        log.info("The detail changed to {}.", currentDetail);

        notifyObservers();
    }

    private void notifyObservers() {
        for (CarDetailObserver obs : observers) {
            obs.update(currentDetail);
        }
    }
}
