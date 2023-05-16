package org.jarotball.generics;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        method(1, 2, 3);
        System.out.println();

        method(1, 2, 3, 4);
        System.out.println();

        method("A","B","C","D");
        System.out.println();

        method(2.5,3.5,4.5,5.5,"A","B","C","D");

    }

    // create a method with variable length arguments using varargs
    public static <T> void method(T... args) {
        Arrays.stream(args)
                .forEach(System.out::print);

    }
}
