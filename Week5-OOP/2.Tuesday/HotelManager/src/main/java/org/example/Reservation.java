package org.example;

public class Reservation {
    private RoomType roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(RoomType roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal(){
        //king is 139, double is 124 10% increase on weekends
        double price = 0;
        if(roomType == RoomType.DOUBLE){
            price = 124;
        }
        else{
            price = 139;
        }

        //ternary operator
        return isWeekend ? (price * numberOfNights) * 1.1 : price * numberOfNights;
    }
}
