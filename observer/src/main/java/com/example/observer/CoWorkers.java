package com.example.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoWorkers implements CarDetailObserver {

    @Override
    public void update(DetailType detailType) {
        log.info("The co-workers is looking into replacing the {}.", detailType);
    }
}
