package org.example;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Scanner class in Java waits for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi there what's your name?");

        //Let's wait for the user to type something
        //and save it in a variable
        //nextLine is for strings
        String userInput = scanner.nextLine();

        System.out.println("Nice to meet you " + userInput);

        System.out.println("How old are you?");

        int userAge = scanner.nextInt();

        System.out.println("You are " + userAge + " years old.");

        System.out.println("What is your favorite color?");

        //If your previous question was a number, and now you ask
        //for a string, it'll skip it because the Scanner is like that

        //THE FIX:
        scanner.nextLine();
        String userColor = scanner.nextLine();

        System.out.println("The color " + userColor + " is nice.");
    }
}
