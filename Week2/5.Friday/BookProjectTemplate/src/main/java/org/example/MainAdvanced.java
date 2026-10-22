package org.example;

import java.util.Scanner;

//If you're feeling more advanced we can use methods to break up
//our code so everything isn't crammed into the main method
public class MainAdvanced {
    public static void main(String[] args) {

    }

    //main is static so these methods must also be static
    //the book class methods will NOT be static
    public static void displayAllBooks(){

    }

    public static void displayBooksByStatus(boolean isCheckedIn){

    }

    public static void checkInBook(Scanner scanner){
        //Yes, pass the scanner from the main method into this method
        //Use it to ask the person for their name, then use the
        //book's check in method
    }
}

