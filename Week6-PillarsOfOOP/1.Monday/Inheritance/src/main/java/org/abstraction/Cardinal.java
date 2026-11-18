package org.abstraction;

public class Cardinal extends Bird implements Flyable{
    @Override
    public void huntForFood() {

    }

    @Override
    public void fly() {
        System.out.println("Flies around North Carolina");
    }
}
