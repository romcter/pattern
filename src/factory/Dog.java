package factory;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
}
