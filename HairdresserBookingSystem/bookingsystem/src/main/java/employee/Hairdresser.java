package employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Hairdresser {
    // instance attribute "name"
    private String name;
    // instance attribute daysAvailable as of type ArrasyList<String>
    private ArrayList<String> daysAvailable = new ArrayList<>();

    // constructor
    public Hairdresser(String name) {
        this.name = name;
    }

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public ArrayList<String> getDaysAvailable() {
        return daysAvailable;
    }

    // setter method
    public void setDaysAvailable(ArrayList<String> daysAvailable) {
        this.daysAvailable = daysAvailable;
    }

    public void setDaysAvailable(String... days) {
        this.daysAvailable.addAll(Arrays.asList(days));
    }

    // method to remove a day from the daysAvailable
    public void removeDay(String day) {
        this.daysAvailable.remove(day);
    }

    // toString
    @Override
    public String toString() {
        return "Hairdresser{" + "name=" + name + ", daysAvailable=" + daysAvailable + '}';
    }




}
