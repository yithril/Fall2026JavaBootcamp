package org.example;

import java.util.Scanner;

//If you're feeling more advanced we can use methods to break up
//our code so everything isn't crammed into the main method
public class MainAdvanced {
    public static void main(String[] args) {

    }

    public static Book[] getAllBooks(){
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

        return books;
    }

    //main is static so these methods must also be static
    //the book class methods will NOT be static
    public static void displayAllBooks(Book[] books){
        for(Book book: getAllBooks()){
            System.out.println(book);
        }
    }

    public static void displayBooksByStatus(boolean isCheckedIn){

    }

    public static void checkInBook(Scanner scanner){
        //Yes, pass the scanner from the main method into this method
        //Use it to ask the person for their name, then use the
        //book's check in method
    }
}

