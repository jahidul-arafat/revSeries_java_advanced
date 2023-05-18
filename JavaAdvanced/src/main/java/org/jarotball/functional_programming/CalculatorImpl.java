package org.jarotball.functional_programming;

public class CalculatorImpl{
    public static void main(String[] args) {
        System.out.println("Welcome to Functional Programming Paradigm");

        // lambda to calculate two numbers using Interface Calculator
        Calculator addition = Double::sum;
        System.out.println(addition.calculate(10, 20));

        // lambda to subtract two numbers using Interface Calculator
        Calculator subtraction = (a, b) -> a - b;
        System.out.println(subtraction.calculate(10, 20));

        // lambda to multiply two numbers using Interface Calculator
        Calculator multiplication = (a, b) -> a * b;
        System.out.println(multiplication.calculate(10, 20));

        // lambda to divide two numbers using Interface Calculator
        Calculator division = (a, b) -> a / b;
        System.out.println(division.calculate(10, 20));




    }
}
