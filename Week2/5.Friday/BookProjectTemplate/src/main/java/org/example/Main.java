package org.example;

import java.util.Scanner;

//This template is to help you know where certain code should live
//This is to help you along if you're stuck
public class Main {
    public static void main(String[] args) {
        //You will only need ONE scanner
        Scanner scanner = new Scanner(System.in);

        // Create 20 Book objects manually in an array
        //Or have ChatGPT help you

        //This while loop runs forever
        //That means the program will run until we tell it to stop.
        while (true) {
            //Show a menu to the user
            //Use the scanner to take in the user input
            //For example
            System.out.println("\n=== BOOK STORE HOME SCREEN ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int userInput = scanner.nextInt();

            //Now use if statements depending on what the person typed
            //How many possibilities are there? Write your if statement structure first

            //Loop through your array of books and use if statements
            //Do we show all books? Only checked-in books?

            //How do we exit the program?
            //This command kills the program at whatever point its at.
            System.exit(0);

            //break
        }
    }
}