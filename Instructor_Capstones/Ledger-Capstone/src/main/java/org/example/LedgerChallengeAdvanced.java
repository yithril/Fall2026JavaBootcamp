package org.example;

//BEWARE!!!!!!!!
//This is MEGA advanced. But you guys love seeing real things
//Do not even attempt to read this unless you really really really
//want to see how stuff is done for real. It pulls no punches.
//This style of programming is more like functional programming
//and less like Object oriented programming
//Seriously, if this is too much don't feel bad about turning back

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LedgerChallengeAdvanced {
    public static void addTransaction(Transaction transaction) {
        FileManager.writeToFile(transaction);
    }

    //Last warning! This is very advanced. Turn back while you
    //still can!
    public static List<Transaction> customSearch(FilterCriteria criteria) {
        List<Transaction> transactions = FileManager.readFile();
        List<Predicate<Transaction>> filters = new ArrayList<>();
        //Jonathan....what is a Predicate?
        //A Predicate is any function that takes in some kind of data and returns true or false
        //This is an abstract concept. Think of it like I took all the functions in the world and put them into categories
        //We filter by start date, end date, etc. Well...those are each functions!
        //We take in a list of transactions and then we decide if it stays or goes (true/false)

        //Notice how I'm using an object to hold the users filter choices
        if (criteria.getStartDate() != null) {
            filters.add(t -> !t.getDate().isBefore(criteria.getStartDate()));
        }

        if (criteria.getEndDate() != null) {
            filters.add(t -> !t.getDate().isAfter(criteria.getEndDate()));
        }

        if (criteria.getDescription() != null && !criteria.getDescription().isEmpty()) {
            filters.add(t -> t.getDescription().toLowerCase().contains(criteria.getDescription().toLowerCase()));
        }

        if (criteria.getVendor() != null && !criteria.getVendor().isEmpty()) {
            filters.add(t -> t.getVendor().equalsIgnoreCase(criteria.getVendor()));
        }

        if (criteria.getAmount() != null) {
            filters.add(t -> t.getAmount() == criteria.getAmount());
        }

        Predicate<Transaction> combinedFilter = filters.stream()
                .reduce(t -> true, Predicate::and);

        return transactions.stream()
                .filter(combinedFilter)
                .toList();
    }
}
