package org.jarotball.functional_programming;

import java.util.ArrayList;
import java.util.List;

public class ShapeImpl {
    public static void main(String[] args) {
        // create an object of Class Square with sideLength to 4
        Square s = new Square(4);

        // We have the Square object. Now implement the Shape interface with the Square object
        Shape shape = Square::calculateArea;

        System.out.println(shape.getArea(s));

    }

}