package org.jarotball.threads_example;

public class RunnableSim {
    public static void main(String[] args) {
        // create a new RunnableImpl instance
        RunnableImpl runnable = new RunnableImpl();
        // create a new Thread instance
        Thread thread = new Thread(runnable);
        // set the name of the thread
        thread.setName("My First Runnable");
        // start the thread
        thread.start();

        // create a new Thread instance
        Thread thread2 = new Thread(() -> System.out.println("Runnable2"));
        // set the name of the thread
        thread2.setName("My Second Runnable");
        // start the thread
        thread2.start();


    }
}

// create a class named Runnable implementing Runnable
/* Runnable is an interface with a single abstract method named run()*/
class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("RunnableImpl");
        // for loop from 1 to 10 and print the current thread name
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" >> "+Thread.currentThread().getName());
        }
    }
}
