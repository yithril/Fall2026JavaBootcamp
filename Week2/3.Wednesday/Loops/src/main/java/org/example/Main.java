package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean dormammuHasHadEnough = false;
        Scanner scanner = new Scanner(System.in);

        while(dormammuHasHadEnough == false){
            System.out.println("Dormammu I've come to bargain.");
            System.out.println("Dormammu destroys Dr. Strange in new and horrific ways.");

            System.out.println("Will you leave my world?");
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("yes")){
                System.out.println("Dr. Strange saves the world.");
                dormammuHasHadEnough = true;
            }
        }

        System.out.println("The movie has ended.");
    }
}