package class_exercise;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private double balance;
    private int pin;

    public BankAccount(long accountNumber, String ownerName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.pin = pin;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setPin(int pin){
        this.pin = pin;
    }
}
