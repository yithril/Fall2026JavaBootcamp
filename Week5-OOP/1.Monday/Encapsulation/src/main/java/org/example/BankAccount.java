package org.example;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //withdraw
    public void withdraw(double amount){
        this.balance -= amount;
        //overdraft logic
        //flag accounts
    }

    public void deposit(double amount){
        this.balance += amount;
    }
}
