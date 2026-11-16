package org.performance;

import java.util.ArrayList;
import java.util.List;

public class PerformanceMain {
    public static void main(String[] args) {
        //Let's get our lineup for the talent show
        Dancer dancer = new Dancer();
        Juggler juggler = new Juggler();
        Magician magician = new Magician();

        List<Performer> performers = new ArrayList<>();

        performers.add(dancer);
        performers.add(juggler);
        performers.add(magician);

        for(Performer person : performers){
            person.perform();

            if(person instanceof Juggler){
                //downcasting
                ((Juggler) person).breatheFire();
            }
        }
    }
}
