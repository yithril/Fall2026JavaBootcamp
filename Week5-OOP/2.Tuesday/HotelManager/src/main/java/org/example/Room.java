package org.example;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isDirty;
    private boolean isOccupied;

    public Room(int numberOfBeds, double price, boolean isDirty, boolean isOccupied) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isAvailable(){
        return !isDirty && !isOccupied;
    }

    //Check in
    //Result of this method is that the room is dirty and occupied
    //access modifier comes first -> public private protected or nothing (package-private)
    //return type is second
    //name of the method
    //what goes inside the parenthesis is parameters
    //method signature
    public void checkIn(){
        isDirty = true;
        isOccupied = true;
    }

    public void checkOut(){
        isDirty = true;
        isOccupied = false;
    }

    public void cleanRoom(){
        isDirty = false;
        isOccupied = false;
    }
}
