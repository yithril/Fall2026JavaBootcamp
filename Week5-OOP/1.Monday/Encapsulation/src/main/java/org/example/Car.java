package org.example;

public class Car {
    //miles per hour
    private double speed;
    private double fuelLevel;
    private double maxFuelCapacity;

    public Car(double maxFuelCapacity){
        this.maxFuelCapacity = maxFuelCapacity;
        this.speed = 0;
        this.fuelLevel = 0;
    }

    public void accelerate(){
        if(isFuelEmpty() == false){
            this.speed += 5;
        }
    }

    //helper method or private method
    private boolean isFuelEmpty(){
        if(fuelLevel == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
