package org.example;

public class Hawk extends Bird implements Flyable{

    @Override
    public void migrate() {
        System.out.println("Heads to the Rocky Mountains.");
    }

    @Override
    public void fly() {
        System.out.println("Flies like a hunter");
    }
}
