package com.example.observer.generic;

import com.example.observer.DetailType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenCoWorkers implements Race {

    @Override
    public void update(GenDetail subject, DetailType argument) {
        log.info("The co-workers is looking into replacing the {}.", argument);
    }
}
