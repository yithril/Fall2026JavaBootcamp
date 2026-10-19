package org.example;

public class Main {
    public static void main(String[] args) {
        int[] grades = new int[5];

        //assigning values to indexes
        grades[0] = 65;
        grades[1] = 79;
        grades[2] = 100;
        grades[3] = 85;
        grades[4] = 45;

        //System.out.println("Grades at index 1 is: " + grades[1]);

        grades[1] = 52;

        //System.out.println("Grades at index 1 is: " + grades[1]);

        //shortcut way to start an array
        String[] fruits = { "Banana", "Strawberry", "Mango", "Plums" };

        //looping through an array
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println("Enhanced--------------------");;
        //enhanced for loops
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}