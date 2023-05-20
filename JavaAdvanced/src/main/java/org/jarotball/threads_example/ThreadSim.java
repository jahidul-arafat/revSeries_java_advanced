package org.jarotball.threads_example;

public class ThreadSim {
    public static void main(String[] args) {
        // print the active thread count
        // System.out.println(Thread.activeCount());

        // print the active thread name
        // System.out.println(Thread.currentThread().getName());

        // create a new thread
        MyThread myThread = new MyThread();
        // set the name of the thread
        myThread.setName("My First Thread");

        // start the thread
        myThread.start();

        // create a new thread
        MyThread myThread2 = new MyThread();
        // set the name of the thread
        myThread2.setName("My Second Thread");

        // start the thread
        myThread2.start();


    }

    // create a class extending Thread
    /*Thread class implements the */
    public static class MyThread extends Thread {
        @Override
        public void run() {
            // while loop to print 1 to 100
            for (int i = 1; i <= 10; i++) {
                System.out.println(i+ " "+ this.getName());
            }

            System.out.println(Thread.currentThread().getName());
        }
    }
}
