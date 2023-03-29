package com.example.factory;

public class CatCreator implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
