package org.example;

public class Animal {
    private String animalType;
    private String name;
    private int age;

    public Animal(String animalType, String name, int age) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
