package org.example;

public class OfficeWorkerRoutine extends DailyRoutine{

    @Override
    public void makeBreakfast() {
        System.out.println("Drink expensive latte.");
    }

    @Override
    public void dailyActivity() {
        System.out.println("Go to my soul crushing office job.");
    }
}
