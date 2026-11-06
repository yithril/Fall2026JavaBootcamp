package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean running = true;

        while (running) {
            printHomeMenu();
            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("D")) {
                addDeposit();
            } else if (choice.equals("P")) {
                addPayment();
            } else if (choice.equals("L")) {
                ledgerMenu();
            } else if (choice.equals("X")) {
                System.out.println("Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void printHomeMenu() {
        System.out.println("\n=== Home Menu ===");
        System.out.println("D) Add Deposit");
        System.out.println("P) Make Payment (Debit)");
        System.out.println("L) Ledger");
        System.out.println("X) Exit");
        System.out.print("Choose an option: ");
    }

    private void addDeposit() {
        System.out.println("\n=== Add Deposit ===");
        Transaction transaction = createTransaction(true);

        Ledger.addTransaction(transaction);
        System.out.println("Deposit added successfully.");
    }

    private void addPayment() {
        System.out.println("\n=== Make Payment (Debit) ===");
        Transaction transaction = createTransaction(false);

        Ledger.addTransaction(transaction);
        System.out.println("Payment added successfully.");
    }

    private Transaction createTransaction(boolean isDeposit) {
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Enter amount: ");
        String amountInput = scanner.nextLine();
        double amount = Double.parseDouble(amountInput);

        if (isDeposit) {
            amount = Math.abs(amount);  // ensure positive
        } else {
            amount = -Math.abs(amount); // ensure negative
        }

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        Transaction transaction = new Transaction(date, time, description, vendor, amount);
        return transaction;
    }

    private void ledgerMenu() {
        boolean backToHome = false;

        while (!backToHome) {
            printLedgerMenu();
            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("A")) {
                List<Transaction> transactions = Ledger.getAll();
                displayTransactions(transactions, "All Transactions");
            } else if (choice.equals("D")) {
                List<Transaction> deposits = Ledger.getDeposits();
                displayTransactions(deposits, "Deposits");
            } else if (choice.equals("P")) {
                List<Transaction> payments = Ledger.getPayments();
                displayTransactions(payments, "Payments");
            } else if (choice.equals("R")) {
                reportsMenu();
            } else if (choice.equals("H")) {
                backToHome = true;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void printLedgerMenu() {
        System.out.println("\n=== Ledger Menu ===");
        System.out.println("A) All");
        System.out.println("D) Deposits");
        System.out.println("P) Payments");
        System.out.println("R) Reports");
        System.out.println("H) Home");
        System.out.print("Choose an option: ");
    }

    private void reportsMenu() {
        boolean backToLedger = false;

        while (!backToLedger) {
            printReportsMenu();
            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                List<Transaction> mtd = Ledger.getMonthToDate();
                displayTransactions(mtd, "Month To Date");
            } else if (choice.equals("2")) {
                List<Transaction> prevMonth = Ledger.getPreviousMonth();
                displayTransactions(prevMonth, "Previous Month");
            } else if (choice.equals("3")) {
                List<Transaction> ytd = Ledger.getYearToDate();
                displayTransactions(ytd, "Year To Date");
            } else if (choice.equals("4")) {
                List<Transaction> prevYear = Ledger.getPreviousYear();
                displayTransactions(prevYear, "Previous Year");
            } else if (choice.equals("5")) {
                System.out.print("Enter vendor name: ");
                String vendor = scanner.nextLine();
                List<Transaction> vendorTransactions = Ledger.getByVendor(vendor);
                displayTransactions(vendorTransactions, "Transactions for Vendor: " + vendor);
            } else if (choice.equals("0")) {
                backToLedger = true;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void printReportsMenu() {
        System.out.println("\n=== Reports Menu ===");
        System.out.println("1) Month To Date");
        System.out.println("2) Previous Month");
        System.out.println("3) Year To Date");
        System.out.println("4) Previous Year");
        System.out.println("5) Search by Vendor");
        System.out.println("0) Back");
        System.out.print("Choose an option: ");
    }

    private void displayTransactions(List<Transaction> transactions, String title) {
        System.out.println("\n=== " + title + " ===");
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}
