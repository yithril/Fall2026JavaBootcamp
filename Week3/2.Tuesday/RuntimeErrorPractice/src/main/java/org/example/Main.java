package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie[] movies = {
                new Movie("Jaws", "Steven Spielberg", 124),
                new Movie("Alien", null, 117),
                new Movie("Dune", "Denis Villeneuve", 155)
        };

        System.out.print("Choose a movie (1-3): ");
        int choice = Integer.parseInt(scanner.nextLine()) - 1;

        Movie selectedMovie = movies[choice];

        System.out.println("Movie: " + selectedMovie.getTitle());
        System.out.println("Runtime with credits: "
                + (selectedMovie.getRuntime() + 10));

        if (selectedMovie.getDirector().equals("Steven Spielberg")) {
            System.out.println("A Spielberg movie!");
        }

        System.out.println("Title length: "
                + selectedMovie.getRuntime());

        System.out.print("Enter the number of tickets: ");
        int tickets = Integer.parseInt(scanner.nextLine());

        int totalMinutes = selectedMovie.getRuntime() * tickets;
        int hours = totalMinutes / 60;

        System.out.println("Total viewing time: " + hours + " hours");

        scanner.close();
    }
}