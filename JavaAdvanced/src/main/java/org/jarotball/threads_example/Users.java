package org.jarotball.threads_example;

import java.util.Scanner;

public class Users {
    // create a BankAccount instance with initialization
    public static final BankAccount account = new BankAccount(50);

    public static void main(String[] args) {
        // user input to get the account using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount:");
        int amount = scanner.nextInt();


        //topUp the account with 100 usd
        account.topUp(100);

        // create a new Thread to withdraw amount from ATM
        Thread withdrawThread1 = new Thread(() -> {
            // set the Thread name
            Thread.currentThread().setName("Ailly");
            // print which thread is currently trying to withdraw
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount+" usd");
            // withdraw 100 usd from
            ATM.withdraw(account,amount);

        });

        // create a new Thread to withdraw amount from ATM
        Thread withdrawThread2 = new Thread(() -> {
            // set the Thread name
            Thread.currentThread().setName("Billy");
            // print which thread is currently trying to withdraw
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw "+amount+" usd");
            // withdraw 100 usd from
            ATM.withdraw(account,amount);

        });

        // start the threads
        withdrawThread1.start();
        withdrawThread2.start();

    }
}
