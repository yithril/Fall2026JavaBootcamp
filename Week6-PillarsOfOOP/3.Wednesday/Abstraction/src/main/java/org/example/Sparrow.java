package org.example;

public class Sparrow extends Bird implements Flyable{
    @Override
    public void migrate() {
        System.out.println("Migrates to South America");
    }

    @Override
    public void fly() {
        System.out.println("Flitters about");
    }
}
