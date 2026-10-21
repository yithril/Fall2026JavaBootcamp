package org.example;

public class BankAccount {
    private double balance;
    private String accountHolder;

    public BankAccount(double balance, String accountHolder){
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    //custom methods
    //We don't always need getters and setters
    public void deposit(double money){
        this.balance += money;
    }

    public void withdraw(double money){
        this.balance -= money;
    }

    public double getBalance() {
        return balance;
    }
}
