package org.example;

//This does the exact same thing as the Ledger class
//This is an advanced version. If you don't get it, no problem!
//However, the code is written in a declarative style
//What does that mean? Basically, are you tired of for-loops over and over?
//Well if you are, let's use streams!

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class AdvancedLedger {
    public static void addTransaction(Transaction transaction) {
        FileManager.writeToFile(transaction);
    }

    public static List<Transaction> getAll() {
        List<Transaction> transactions = FileManager.readFile();
        return sortDescending(transactions);
    }

    public static List<Transaction> getDeposits() {
        List<Transaction> transactions = FileManager.readFile();
        return transactions.stream()
                .filter(t -> t.getAmount() > 0)
                .sorted(byDateAndTimeDescending())
                .toList();
    }

    public static List<Transaction> getPayments() {
        List<Transaction> transactions = FileManager.readFile();
        return transactions.stream()
                .filter(t -> t.getAmount() < 0)
                .sorted(byDateAndTimeDescending())
                .toList();
    }

    public static List<Transaction> getByVendor(String vendor) {
        List<Transaction> transactions = FileManager.readFile();
        return transactions.stream()
                .filter(t -> t.getVendor().equalsIgnoreCase(vendor))
                .sorted(byDateAndTimeDescending())
                .toList();
    }

    public static List<Transaction> getMonthToDate() {
        List<Transaction> transactions = FileManager.readFile();
        LocalDate now = LocalDate.now();
        return transactions.stream()
                .filter(t -> t.getDate().getMonth() == now.getMonth() &&
                        t.getDate().getYear() == now.getYear())
                .sorted(byDateAndTimeDescending())
                .toList();
    }

    public static List<Transaction> getPreviousMonth() {
        List<Transaction> transactions = FileManager.readFile();
        LocalDate now = LocalDate.now();
        LocalDate previousMonth = now.minusMonths(1);
        return transactions.stream()
                .filter(t -> t.getDate().getMonth() == previousMonth.getMonth() &&
                        t.getDate().getYear() == previousMonth.getYear())
                .sorted(byDateAndTimeDescending())
                .toList();
    }

    public static List<Transaction> getYearToDate() {
        List<Transaction> transactions = FileManager.readFile();
        int currentYear = LocalDate.now().getYear();
        return transactions.stream()
                .filter(t -> t.getDate().getYear() == currentYear)
                .sorted(byDateAndTimeDescending())
                .toList();
    }

    public static List<Transaction> getPreviousYear() {
        List<Transaction> transactions = FileManager.readFile();
        int previousYear = LocalDate.now().getYear() - 1;
        return transactions.stream()
                .filter(t -> t.getDate().getYear() == previousYear)
                .sorted(byDateAndTimeDescending())
                .toList();
    }

    // Helper to sort by date and time descending
    //Comparator is a special class to help us sort data
    //It's great for objects like Transaction where we may want to sort
    //on two things at once
    private static Comparator<Transaction> byDateAndTimeDescending() {
        return Comparator.comparing(Transaction::getDate)
                .thenComparing(Transaction::getTime)
                .reversed();
    }

    private static List<Transaction> sortDescending(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(byDateAndTimeDescending())
                .toList();
    }
}
