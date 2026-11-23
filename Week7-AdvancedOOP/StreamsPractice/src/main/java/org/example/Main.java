package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> database = PersonRepository.getPeople();
        
        // 1. Print the full names of all people who live in Texas.

        //displayPeople(texasList);

        // 2. Print the full names of all people who are teachers.


        // 3. Print the full names of people who earn more than $90,000.

        // 4. Print the full names of people who live in Florida and earn less than $60,000.


        // 5. Print the full names of doctors who live in California.

        // 6. Print the full names of people who do not live in New York.

        // 7. Print the full names of engineers who earn more than $80,000.

        // 8. Print the full names of people who are not teachers and not doctors.

        // 9. Print the full names of people who live in Texas or Florida.

        // 10. Print the full names of people who earn between $50,000 and $100,000.

        // 11. Count how many people live in Texas.

        // 12. Count how many people are doctors.

        // 13. Count how many people earn less than $60,000.

        // 14. Count how many people are not teachers.

        // 15. Count how many people live in California and earn more than $90,000.

        // 16. Find the average income of all people.

        // 17. Find the average income of teachers.

        // 18. Find the average income of people who live in New York.

        // 19. Find the highest income in the list.

        // 20. Find the highest income of anyone who is a doctor.
    }

    //This function is here for re-use
    public static void displayPeople(List<Person> people){
        people.stream().forEach(x -> System.out.println(x.toString()));
    }
}