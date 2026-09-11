package animalpackage;

public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }
}