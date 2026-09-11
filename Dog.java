package animalpackage;

public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}