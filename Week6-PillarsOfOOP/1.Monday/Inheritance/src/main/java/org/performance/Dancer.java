package org.performance;

public class Dancer extends Performer {

    //Override
    //Override allows you to keep the method but change how it works
    //The method signature must be the same
    @Override
    public void perform(){
        System.out.println("Does a beautiful ballet dance.");
    }
}
