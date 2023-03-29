package com.example.factory;

public class AnimalRunner {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalBySong("mia");
        Animal animal = animalFactory.createAnimal();
        animal.eat();
    }

    static AnimalFactory createAnimalBySong(String song){
        return switch (song){
            case "gaf" -> new DogCreator();
            case "mia" -> new CatCreator();
            default -> throw new RuntimeException(song + " song is unknown.");
        };
    }
}
