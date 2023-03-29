package com.example.strategy;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();

        person.setSmoking(new Cigarettes());
        person.executeSmoking();

        person.setSmoking(new Cigarillo());
        person.executeSmoking();

        person.setSmoking(new Cigar());
        person.executeSmoking();

        person.setSmoking(new ElfBar());
        person.executeSmoking();
    }
}
