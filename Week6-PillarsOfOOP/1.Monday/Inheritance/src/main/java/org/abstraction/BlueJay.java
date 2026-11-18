package org.abstraction;

public class BlueJay extends Bird implements Flyable {
    @Override
    public void huntForFood() {
        System.out.println("Digs for worms in the ground.");
    }

    @Override
    public void fly() {
        System.out.println("Flies majestically");
    }
}
