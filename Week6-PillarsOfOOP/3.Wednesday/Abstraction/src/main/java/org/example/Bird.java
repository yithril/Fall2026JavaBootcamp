package org.example;

public abstract class Bird {
    public void sing(){
        System.out.println("Sings a pretty melody.");
    }

    //birds migrate
    //abstract methods do not have an implementation
    //implementation is a fancy way of saying curly braces
    //and stuff inside the curly braces
    public abstract void migrate();
}
