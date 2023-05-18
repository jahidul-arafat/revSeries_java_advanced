package org.jarotball.functional_programming;

public class Square {
    // instance attribute "sideLength"
    private int sideLength;

    // constructor
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    // method to calculate the area of square
    public int calculateArea() {
        return sideLength * sideLength;
    }

    // getter
    public int getSideLength() {
        return sideLength;
    }

    // setter
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    // print the object
    @Override
    public String toString() {
        return "Square{" + "sideLength=" + sideLength + '}';
    }
}
