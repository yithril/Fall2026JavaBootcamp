package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Reservation reservation = new Reservation(RoomType.DOUBLE, 100,
                5, false);

        //124 for a double 620
        System.out.println(reservation.getReservationTotal());

        Room room = new Room(5, 5.5, false ,false);

        room.setPrice(500);
    }
}