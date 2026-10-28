package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a bedtime story:");
            System.out.println("1. Goldilocks");
            System.out.println("2. Hansel and Gretel");
            System.out.println("3. Mary Had a Little Lamb");
            System.out.println("4. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    printStory("src/main/resources/goldilocks.txt");
                    break;
                case "2":
                    printStory("src/main/resources/hansel_and_gretel.txt");
                    break;
                case "3":
                    printStory("src/main/resources/mary_had_a_little_lamb.txt");
                    break;
                case "4":
                    System.out.println("Goodnight!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    public static void printStory(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
