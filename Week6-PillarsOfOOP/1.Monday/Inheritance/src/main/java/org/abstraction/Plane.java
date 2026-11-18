package org.abstraction;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flies up in the sky really high.");
    }
}
