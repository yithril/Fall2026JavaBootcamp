package org.example;

public class Cat extends Animal {
    public Cat(String animalType, String name, int age) {
        super(animalType, name, age);
    }

    public void meow(){
        System.out.println("Meow");
    }
}
