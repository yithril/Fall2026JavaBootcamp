package org.example;

public class Main {
    public static void main(String[] args) {
        //types of variables
        //int long float double char boolean PRIMITIVE data types
        int x = 5;
        long y = 10_000;
        double price = 10.5;
        float temperature = 67.8f;
        boolean isStudent = true;
        String name = "Bob";

        Person person = new Person("Joe", 25);

        person.getName();
        person.setName("Kyle");

        int[] grades = new int[5];
        grades[0] = 100;
        grades[1] = 50;

        String[] fruits = { "Banana", "Orange", "Pineapple" };
        Person[] people = { new Person("Joe", 42) };
        //length or size

        //difference between while and do while loops
        int p = 10;
        do {

        }
        while(p >= 10);

        while(p >= 10){

        }

        for(int j = 0; j < 5; j++){

        }
    }

    public static void doubleIt(int n) {
        System.out.println(n * 2);
    }


}