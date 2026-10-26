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
        Book[] books = {
                new Book(1, "978-0-000-00001-1", "The Hobbit", true, "Alice Johnson"),
                new Book(2, "978-0-000-00002-8", "Dune", false, null),
                new Book(3, "978-0-000-00003-5", "The Hound of the Baskervilles", true, "Marcus Lee"),
                new Book(4, "978-0-000-00004-2", "Clean Code", true, "Priya Patel"),
                new Book(5, "978-0-000-00005-9", "Pride and Prejudice", false, null),
                new Book(6, "978-0-000-00006-6", "The Guns of August", false, null),
                new Book(7, "978-0-000-00007-3", "Neuromancer", true, "Diego Ramirez"),
                new Book(8, "978-0-000-00008-0", "Gone Girl", false, null),
                new Book(9, "978-0-000-00009-7", "Sapiens", false, null),
                new Book(10, "978-0-000-00010-3", "The Name of the Wind", true, "Hannah Kim"),
                new Book(11, "978-0-000-00011-0", "Head First Java", false, null),
                new Book(12, "978-0-000-00012-7", "The Shining", true, "Samuel Okafor"),
                new Book(13, "978-0-000-00013-4", "To Kill a Mockingbird", false, null),
                new Book(14, "978-0-000-00014-1", "The Martian", true, "Emily Chen"),
                new Book(15, "978-0-000-00015-8", "And Then There Were None", false, null),
                new Book(16, "978-0-000-00016-5", "Atomic Habits", false, null),
                new Book(17, "978-0-000-00017-2", "The Art of War", true, "Noah Williams"),
                new Book(18, "978-0-000-00018-9", "Mistborn", false, null),
                new Book(19, "978-0-000-00019-6", "Dracula", false, null),
                new Book(20, "978-0-000-00020-2", "The Pragmatic Programmer", true, "Fatima Hassan")
        };

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

            int userInput = Integer.parseInt(scanner.nextLine());

            for(Book book : books){
                if(book.isCheckedOut() == true){
                    System.out.println(book.getId() + " " + book.getTitle());
                }
            }

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