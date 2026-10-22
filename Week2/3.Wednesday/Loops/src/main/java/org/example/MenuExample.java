package org.example;

import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please select from the following options:");
            System.out.println("1) New Superheroes");
            System.out.println("2) Elite Superheroes");
            System.out.println("3) Customer Service");
            System.out.println("4) Exit");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("New Superheroes");
                    break;
                case 2:
                    System.out.println("Elite Superheroes");
                    break;
                case 3:
                    System.out.println("Customer Service");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0); //stop the program
                    break;
                default:
                    System.out.println("Please try again.");
            }
        }
    }
}
