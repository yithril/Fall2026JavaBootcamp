package org.example;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        //Hey computer, sit here and wait until they type something
        //and hit enter
        String name = scanner.nextLine();

        System.out.println("Hi there " + name + " and welcome!");

        System.out.println("How old are you?");

        //Again, we're going to sit here until they type a number
        int age = scanner.nextInt();

        System.out.println("You are: " + age + " years old.");

        //Another way to do string interpolation
        //is printf
        float temperature = 86.5938230f;

        System.out.printf("Today the temperature is %.2f %n", temperature);

        System.out.printf("Your name is %s and you are %d years old and it is %.2f degrees outside.", name, age, temperature);
    }
}
