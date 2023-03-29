package com.example.strategy;

public class Person {

    private Smoking smoking;

    public void executeSmoking(){
        this.smoking.smoke();
    }

    public void setSmoking(Smoking smoking) {
        this.smoking = smoking;
    }
}
