package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//I put the challenge in a separate class
//so that it would be easier to see. This is the most direct
//way to solve "Challenge Yourself" where you basically
//run all the transactions with several filters.
//If you're wondering if I'd do this on the job, for real, no.
//This code would be difficult to make changes to over time, but the
//way I'd actually do it is super advanced

public class LedgerChallenge {
    public static void addTransaction(Transaction transaction) {
        FileManager.writeToFile(transaction);
    }

    public static List<Transaction> customSearch(
            LocalDate startDate,
            LocalDate endDate,
            String description,
            String vendor,
            Double amount
    ) {
        List<Transaction> transactions = FileManager.readFile();
        List<Transaction> filtered = new ArrayList<>();

        //I need to loop through the transactions and
        //keep the transactions the user wants
        for (Transaction t : transactions) {
            boolean matches = true;

            // Filter by start date
            if (startDate != null) {
                if (t.getDate().isBefore(startDate)) {
                    matches = false;
                }
            }

            // Filter by end date
            if (endDate != null) {
                if (t.getDate().isAfter(endDate)) {
                    matches = false;
                }
            }

            // Filter by description
            if (description != null && !description.isEmpty()) {
                if (!t.getDescription().toLowerCase().contains(description.toLowerCase())) {
                    matches = false;
                }
            }

            // Filter by vendor
            if (vendor != null && !vendor.isEmpty()) {
                if (!t.getVendor().equalsIgnoreCase(vendor)) {
                    matches = false;
                }
            }

            // Filter by amount
            if (amount != null) {
                if (t.getAmount() != amount) {
                    matches = false;
                }
            }

            if (matches) {
                filtered.add(t);
            }
        }

        return filtered;
    }
}
