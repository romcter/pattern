package com.example.factory;

public class DogCreator implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
