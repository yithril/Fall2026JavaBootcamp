package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BlueJay blueJay = new BlueJay();
        blueJay.sing();

        Penguin penguin = new Penguin();

        //Abstract classes cannot be instantiated
        //Bird bird = new Bird();
        //bird.sing();

        Hawk hawk = new Hawk();
        Sparrow sparrow = new Sparrow();
        Helicopter helicopter = new Helicopter();

        List<Flyable> flyers = new ArrayList<>();
        flyers.add(blueJay);
        flyers.add(hawk);
        flyers.add(sparrow);
        flyers.add(helicopter);
    }
}