package org.example;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Sharikov");
        Cat cat = new Cat("Begemot");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}

