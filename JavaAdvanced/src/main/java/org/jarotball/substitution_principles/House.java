package org.jarotball.substitution_principles;

// class House inherited from Building


public class House extends Building {
    public House(int numberOfRooms) {
        super(numberOfRooms);
    }

    // getter
    public int getNumberOfRooms() {
        return super.getNumberOfRooms();
    }

    // setter
    public void setNumberOfRooms(int numberOfRooms) {
        super.setNumberOfRooms(numberOfRooms);
    }

    // toString method
    @Override
    public String toString() {
        return "House: " + super.getNumberOfRooms();
    }
}
