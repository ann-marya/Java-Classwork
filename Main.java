package animalpackage;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Tommy");
        Cat cat = new Cat("Kitty");
        Lion lion = new Lion("Leo");

        System.out.println("----- DOG -----");
        dog.display();
        dog.makeSound();
        dog.play();

        System.out.println();

        System.out.println("----- CAT -----");
        cat.display();
        cat.makeSound();
        cat.play();

        System.out.println();

        System.out.println("----- LION -----");
        lion.display();
        lion.makeSound();

        System.out.println();

        System.out.println("----- POLYMORPHISM -----");

        Animal a1 = new Dog("Bruno");
        Animal a2 = new Cat("Milo");
        Animal a3 = new Lion("Simba");

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}