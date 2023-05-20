package org.jarotball.threads_example;

public class Kitchen {
    // create an object called "spoon" of type Object
    private static final Object spoon = new Object();
    // create an object called "bowl" of type Object
    private static final Object bowl = new Object();

    public static void main(String[] args) {
        // Create a thread
        Thread cook1 = new Thread(()-> {
            // set the Thread name
            Thread.currentThread().setName("Cook1");
            synchronized (spoon) {
                System.out.println(Thread.currentThread().getName()+"// "+"Holding Spoon");
                System.out.println(Thread.currentThread().getName()+"// "+"Waiting for Bowl");

                // add a nested synchronized bowl
                synchronized (bowl) {
                    System.out.println(Thread.currentThread().getName()+"// "+"Holding both Spoon and Bowl.");
                }
            }

        });

        // create another thread
        Thread cook2 = new Thread(()-> {
            // set the Thread name
            Thread.currentThread().setName("Cook2");
            synchronized (spoon) {
                System.out.println(Thread.currentThread().getName()+"// "+"Holding Spoon");
                System.out.println(Thread.currentThread().getName()+"// "+"Waiting for Bowl");

                // add a nested synchronized bowl
                synchronized (bowl) {
                    System.out.println(Thread.currentThread().getName()+"// "+"Holding both Spoon and Bowl.");
                }
            }

        });

        // start the threads
        cook1.start();
        cook2.start();
    }
}
