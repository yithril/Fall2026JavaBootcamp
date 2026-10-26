package org.example;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //types of variables
        //int long float double char boolean byte short PRIMITIVE data types
        //primitive data types begin with lower case letters
        int x = 5;
        long y = 10_000;
        double price = 10.5;
        float temperature = 67.8f;
        boolean isStudent = true;
        String name = "Bob";
        char grade = 'A';

        //We can't mix and match
        //int example = 30.0;

        Person person = new Person("Joe", 25);

        person.getName();
        person.setName("Kyle");

        int[] grades = new int[5];
        grades[0] = 100;
        grades[1] = 50;

        System.out.println(grades[2]);

        String[] fruits = { "Banana", "Orange", "Pineapple" };
        Person[] people = { new Person("Joe", 42) };
        //length or size

        //difference between while and do while loops
        int p = 10;
        do {
            System.out.println("This will happen at least once, even condition is false");
        }
        while(p < 10);

        while(p < 10){
            System.out.println("If the condition is false, this will not run.");
        }

        for(int j = 0; j < 5; j++){

        }
    }



    //methods take data in and do something with it
    public static void doubleIt(int n) {
        System.out.println(n * 2);
    }

    public static double multiply(double a, double b){
        return a * b;
    }

}