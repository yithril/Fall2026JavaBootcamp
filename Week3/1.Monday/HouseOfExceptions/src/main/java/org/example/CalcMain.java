package org.example;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        System.out.println("Welcome to simple calculator!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("This calculator is cheap and only divides");
        System.out.println("Give me the first number:");

        try{
            int firstNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nice work, gimme the second number:");
            int secondNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Solid. Let's divide them and see what happens");
            System.out.println(firstNumber/secondNumber);
        }
        catch(Exception ex){
            System.out.println("This is for any kind of exception");
        }

        System.out.println("Thanks for using the simple calculator!");
    }
}
