package org.example;

public class Dog extends Animal {
    private String breed;

    public Dog(String animalType, String name, int age, String breed) {
        super(animalType, name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Woof!");
    }


}
