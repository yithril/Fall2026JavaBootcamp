package org.example;

public abstract class DailyRoutine {
    //concrete methods
    public void washFace(){
        System.out.println("Washes their face");
    }

    public void takeShower(){
        System.out.println("Cleans up in the shower");
    }

    public final void sleep(){
        System.out.println("Good night!");
    }

    //abstract methods
    public abstract void makeBreakfast();
    public abstract void dailyActivity();

    public void doRoutine(){
        washFace();
        takeShower();
        makeBreakfast();
        dailyActivity();
        sleep();
    }
}
