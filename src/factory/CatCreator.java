package factory;

public class CatCreator implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
