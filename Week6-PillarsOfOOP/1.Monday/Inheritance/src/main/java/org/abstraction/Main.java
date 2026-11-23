package org.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Bird watching app
        BlueJay blueJay = new BlueJay();
        blueJay.sing();

        Penguin penguin = new Penguin();

        Robin robin = new Robin();
        Cardinal cardinal = new Cardinal();

        List<Flyable> thingsThatFly = new ArrayList<>();
        thingsThatFly.add(robin);
        thingsThatFly.add(blueJay);

        for(Flyable flyingThing : thingsThatFly){
            flyingThing.fly();
        }

        Flyable newThingThatFlies = new BlueJay();
        newThingThatFlies = new Robin();
        newThingThatFlies = new Cardinal();
    }
}
