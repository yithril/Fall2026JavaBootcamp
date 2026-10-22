package org.example;

public class Main {
    public static void main(String[] args) {
        //lets make an array of integers
        int[] grades = new int[5]; //creates an array of integers of size 5

        //How do we put data into an index?
        grades[0] = 75;
        grades[1] = 82;
        grades[2] = 100;
        grades[3] = 54;
        grades[4] = 97;

        System.out.println("The element at index 1 is: " + grades[1]);

        String[] fruits = { "Strawberry", "Peach", "Apple", "Orange" };
        double[] weights = { 50.5, 20.56, 100 };

        //we can loop through an array two ways with two different for loops
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        //enhanced for loop - works with things like Lists and Arrays
        for(double weight : weights){
            System.out.println(weight);
        }

        //Objects are not special, you can have an array of objects
        Person[] personArray = new Person[4];

        personArray[0] = new Person("Bob", "Jones");

        //How do I get the first name of the person at index 0?
        System.out.println(personArray[0]);
    }
}