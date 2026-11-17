package org.vehicleexercise;

public class Moped extends Vehicle {
    private boolean hasPedal;

    public Moped(int numberOfPassengers, boolean hasPedal) {
        super(numberOfPassengers);
        this.hasPedal = hasPedal;
    }

    public boolean isHasPedal() {
        return hasPedal;
    }

    public void setHasPedal(boolean hasPedal) {
        this.hasPedal = hasPedal;
    }
}
