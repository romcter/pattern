package com.example.facade;

public class ActivityForDay {

    private final WakeUp wakeUp = new WakeUp();
    private final Eat eat = new Eat();
    private final Work work = new Work();
    private final Rest rest = new Rest();

    public void organizeDay(){
        wakeUp.wakeUp();
        eat.eat();
        work.prepareForWork();
        work.getTorWork();
        work.work();
        rest.rest();
    }
}
