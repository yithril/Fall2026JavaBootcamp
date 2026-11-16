package org.example;

public class BlueJay extends Bird implements Flyable {

    @Override
    public void migrate() {
        System.out.println("Flies 100 miles south.");
    }

    @Override
    public void fly() {
        System.out.println("Flies in the sky");
    }
}
