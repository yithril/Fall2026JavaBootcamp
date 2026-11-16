package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", "fido", 2, "Golden Retriever");
        dog.setName("Fido");

        Cat cat = new Cat("cat", "fluffy", 10);
        cat.setName("Fluffy");

        dog.bark();
        cat.meow();
    }
}