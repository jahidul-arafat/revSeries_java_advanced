package org.jarotball.threads_example;

public class BankAccount {
    // instance attributes "balance" and "overdraft"
    private int balance = 0;
    private final int overdraft;

    // constructor
    public BankAccount(int overdraft) {
        this.overdraft = overdraft;
    }

    // method topUp to add amount to balance
    public void topUp(int amount) {
        balance += amount;
    }

    // method withdraw to remove amount from balance
    public void debit(int amount) {
        balance -= amount;
    }

    // method getBalance to return balance
    public int getBalance() {
        return balance;
    }

    // method getOverdraft to return overdraft
    public int getOverdraft() {
        return overdraft;
    }

    // method toString
    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", overdraft=" + overdraft + '}';
    }

}
