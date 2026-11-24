package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("George");

        System.out.println(person.getName());
        person.setName("Bob");

        Dog dog = new Dog("Dog", true);

        dog.makeSound();

        Calculator calculator = new Calculator();

        calculator.add(1,2,3);

        VideoGame vg = new VideoGame("GTA 6", new BigDecimal("60"));

        RecipeCalculator.convertToFahrenheit(50);
    }
}