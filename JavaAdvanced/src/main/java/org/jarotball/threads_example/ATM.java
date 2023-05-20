package org.jarotball.threads_example;

public class ATM {
    // method to withdraw money from the BankAccount
    // make the below method to be synchronized
    public synchronized static void withdraw(BankAccount account, int amount) {
        // get the account balance
        double balance = account.getBalance();

        // check if (balance - amount) is less than account's overdraft limit. Is so, transaction declined, else debit the amount
        if ((balance - amount) < - account.getOverdraft()) {
            System.out.println(Thread.currentThread().getName()+"/"+"Transaction declined");
        } else {
            account.debit(amount);

            // print transaction successful with the amount
            System.out.println(Thread.currentThread().getName()+"/"+"Transaction successful with " + amount);

        }
        System.out.println("Current balance: " + account.getBalance());

    }
}
