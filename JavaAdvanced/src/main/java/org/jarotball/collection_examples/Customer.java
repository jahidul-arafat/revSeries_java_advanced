package org.jarotball.collection_examples;

public class Customer {
    private String name;
    private boolean hasBeenServed=false;

    // constructor
    public Customer(String name) {
        this.name = name;
    }

    // getters
    public String getName() {
        return name;
    }
    public boolean isHasBeenServed() {
        return hasBeenServed;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHasBeenServed(boolean hasBeenServed) {
        this.hasBeenServed = hasBeenServed;
    }

    // method to server the customer, set the boolean to true and print
    public void serve() {
        hasBeenServed = true;
        System.out.println(name + " has been served");
    }

    // print the object
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", hasBeenServed=" + hasBeenServed + '}';
    }

}
