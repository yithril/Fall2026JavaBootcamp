package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ledger {

    public static void addTransaction(Transaction transaction) {
        FileManager.writeToFile(transaction);
    }

    public static List<Transaction> getAll() {
        return FileManager.readFile();
    }

    public static List<Transaction> getDeposits() {
        List<Transaction> transactions = FileManager.readFile();
        List<Transaction> deposits = new ArrayList<>();

        for (Transaction t : transactions) {
            if (t.getAmount() > 0) {
                deposits.add(t);
            }
        }

        return deposits;
    }

    public static List<Transaction> getPayments() {
        List<Transaction> transactions = FileManager.readFile();
        List<Transaction> payments = new ArrayList<>();

        for (Transaction t : transactions) {
            if (t.getAmount() < 0) {
                payments.add(t);
            }
        }

        return payments;
    }

    public static List<Transaction> getByVendor(String vendor) {
        List<Transaction> transactions = FileManager.readFile();
        List<Transaction> vendorMatches = new ArrayList<>();

        int x = 5;
        for (Transaction t : transactions) {
            if (t.getVendor().equalsIgnoreCase(vendor)) {
                vendorMatches.add(t);
            }
        }

        return vendorMatches;
    }

    public static List<Transaction> getMonthToDate() {
        List<Transaction> transactions = FileManager.readFile();
        List<Transaction> result = new ArrayList<>();
        LocalDate now = LocalDate.now();

        for (Transaction t : transactions) {
            if (t.getDate().getMonth() == now.getMonth() &&
                    t.getDate().getYear() == now.getYear()) {
                result.add(t);
            }
        }

        return result;
    }

    public static List<Transaction> getPreviousMonth() {
        List<Transaction> transactions = FileManager.readFile();
        List<Transaction> result = new ArrayList<>();
        LocalDate now = LocalDate.now();
        LocalDate previousMonth = now.minusMonths(1);

        for (Transaction t : transactions) {
            if (t.getDate().getMonth() == previousMonth.getMonth() &&
                    t.getDate().getYear() == previousMonth.getYear()) {
                result.add(t);
            }
        }

        return result;
    }

    public static List<Transaction> getYearToDate() {
        List<Transaction> transactions = FileManager.readFile();
        List<Transaction> result = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();

        for (Transaction t : transactions) {
            if (t.getDate().getYear() == currentYear) {
                result.add(t);
            }
        }

        return result;
    }

    public static List<Transaction> getPreviousYear() {
        List<Transaction> transactions = FileManager.readFile();
        List<Transaction> result = new ArrayList<>();
        int previousYear = LocalDate.now().getYear() - 1;

        for (Transaction t : transactions) {
            if (t.getDate().getYear() == previousYear) {
                result.add(t);
            }
        }

        return result;
    }
}
