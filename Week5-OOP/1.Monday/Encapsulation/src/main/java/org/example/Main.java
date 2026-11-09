package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount("Bob", 1000);

        //firstAccount.balance = 100000000;

        firstAccount.deposit(100);
        firstAccount.withdraw(500);
    }
}