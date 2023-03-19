package com.example.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Supervisor implements CarDetailObserver {

    @Override
    public void update(DetailType detailType) {
        log.info("The supervisor is looking into replacing the {}.", detailType);
    }
}
