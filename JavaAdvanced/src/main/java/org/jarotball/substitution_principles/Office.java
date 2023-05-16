package org.jarotball.substitution_principles;

// inheritance
public class Office extends Building{
    // constructor
    public Office(int numberOfRooms) {
        super(numberOfRooms);
    }

    // override the toString method with a string representation
    @Override
    public String toString() {
        return "Office{" +
                "numberOfRooms=" + super.getNumberOfRooms() +
                '}';
    }
}
