package org.example;

public class Dog extends Animal{
    private boolean isGoodBoy;

    public Dog(String species, boolean isGoodBoy) {
        super(species);
        this.isGoodBoy = isGoodBoy;
    }

    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
}
