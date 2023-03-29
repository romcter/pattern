package com.example.pipeline;

public class Multiply implements Handler<Integer, Integer> {

    @Override
    public Integer process(Integer input) {
        var resultMultiplying = input * 2;
        System.out.printf("Result of multiplying %s to 2 is %s; \n", input, resultMultiplying);
        return resultMultiplying;
    }
}
