package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("George");

        System.out.println(person.getName());
        person.setName("Bob");

        Dog dog = new Dog("Dog", true);

        dog.makeSound();

        Calculator calculator = new Calculator();

        calculator.add(1,2,10);
    }
}