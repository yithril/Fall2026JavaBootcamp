package org.example;

import java.util.Scanner;

public class QuotesExercise {
    public static void main(String[] args) {
        String[] demotivationalQuotes = {
                "Hard work pays off... eventually. Laziness pays off now.",
                "If at first you don't succeed, maybe it's not for you.",
                "Dream big. Then wake up and lower your expectations.",
                "The road to success is under construction. Detour indefinitely.",
                "You tried your best, and that’s what matters. Unfortunately.",
                "Some people graduate with honors. You are just honored to graduate.",
                "Failure is always an option.",
                "You miss 100% of the shots you don't take... and most of the ones you do.",
                "Keep going. Or don’t. It probably won’t make a difference.",
                "Success is just failure that hasn’t happened yet."
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPick a number (1-10) to get a quote, or type 0 to exit:");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Alright, no more motivation for today.");
                System.exit(0);
            }

            if (choice < 1 || choice > demotivationalQuotes.length) {
                System.out.println("Hmm, that number is out of range. Try something between 1 and 10.");
            } else {
                System.out.println("\n" + demotivationalQuotes[choice - 1]);
            }
        }
    }
}
