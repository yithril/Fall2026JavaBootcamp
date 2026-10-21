package org.example;

public class Main {
    public static void main(String[] args) {
        //instantiate
        //On line 7 we instantiate a bank account
        BankAccount bankAccount =
                new BankAccount(100, "Jonathan Hop");

        //balance is private it's not accessible here
        //bankAccount.balance = 10000000;

        //I'm calling  the deposit method
        bankAccount.deposit(1000);

        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
    }
}