package org.jarotball.functional_programming;

public class GreetingMsgImpl {
    public static void main(String[] args) {
        System.out.println("Welcome to greeting message implementation using with or without Lambda");

        // without lambda, greeting message implementation with GreetingMessage
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.printf("Welcome Mr. %s\n", name);
            }
        };
        gm.greet("John");

        // implement the same but using Lambda
        GreetingMessage gm2 = (name) -> System.out.printf("Welcome Mr. %s\n", name);
        gm2.greet("Jahidul Arafat");

        // implement MessagePrinter Functional interface using lambda
        MessagePrinter mp = () -> System.out.printf("Welcome Mr. ARfaat");
        mp.print();



    }
}
