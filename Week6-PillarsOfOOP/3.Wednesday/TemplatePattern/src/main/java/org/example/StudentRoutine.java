package org.example;

public class StudentRoutine extends DailyRoutine {

    @Override
    public void makeBreakfast() {
        System.out.println("Put some cheap cereal in a bowl and eat it.");
    }

    @Override
    public void dailyActivity() {
        System.out.println("Sleep during class, can't keep eyes open.");
    }

    //cant do this, sleep is final
//    @Override
//    public void sleep(){
//        System.out.println("Snores loudly.");
//    }
}
