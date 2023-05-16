package org.jarotball.substitution_principles;

/**
 * @author <a href="mailto:jahidapon@gmail.com">
 */
public class Building {
    // instance attribute named "numberOfRooms"
    private int numberOfRooms;


    // constructor
    public Building(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    // getter and setter
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }


    @Override
    public String toString() {
        return "Building{" +
                "numberOfRooms=" + numberOfRooms +
                '}';
    }
}
