package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        What parts of this code are exactly the same every time?
        What parts are changing?
        If we had 50 items, what would be annoying about this?
         */
        System.out.println("----- RECEIPT -----");
        System.out.println("Item: Burger");
        System.out.println("Price: $" + 8.99);
        System.out.println("Tax: $" + (8.99 * 0.06));
        System.out.println("Total: $" + (8.99 + (8.99 * 0.06)));
        System.out.println("-------------------");

        System.out.println("----- RECEIPT -----");
        System.out.println("Item: Fries");
        System.out.println("Price: $" + 3.49);
        System.out.println("Tax: $" + (3.49 * 0.06));
        System.out.println("Total: $" + (3.49 + (3.49 * 0.06)));
        System.out.println("-------------------");

        System.out.println("----- RECEIPT -----");
        System.out.println("Item: Shake");
        System.out.println("Price: $" + 4.99);
        System.out.println("Tax: $" + (4.99 * 0.06));
        System.out.println("Total: $" + (4.99 + (4.99 * 0.06)));
        System.out.println("-------------------");

        //Let's rewrite this repetitive code as a method
    }
}