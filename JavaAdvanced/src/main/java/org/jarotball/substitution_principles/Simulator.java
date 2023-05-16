package org.jarotball.substitution_principles;

import java.util.ArrayList;
import java.util.List;

public class Simulator {
    public static void main(String[] args) {
        Building building = new Building(7);
        Office office = new Office(10);
        printObject(building);
        printObject(office); // substitution principles in java is applied if subclass object
                                // is passed as a argument to a method taking superclass objects


        // printOffice(building); // substitution principle not applied
        Building building1 = new Office(5);
        System.out.println(building1);

        // create a new House instance
        House house = new House(10);
        printObject(house);

        // Give me a list of building objects
        List<Building> buildingList = new ArrayList<>();
        buildingList.add(building);
        buildingList.add(office);
        buildingList.add(building1);
        buildingList.add(house);
        printObjectList(buildingList);


        // create a list of office objects
        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office(4));
        officeList.add(new Office(6));
        officeList.add(new Office(8));
        printObjectList(officeList);

        System.out.println();

        // create a list of house objects
        List<House> houseList = new ArrayList<>();
        houseList.add(new House(10));
        houseList.add(new House(12));
        houseList.add(new House(14));
        printObjectList(houseList);
    }

    // method to print building object
    public static <T> void printObject(T building) {
        System.out.println(building);
    }


    // method taking a List of building objects as arguments of type List and print them.
    public static <T> void printObjectList(List<T> buildingList) {
        buildingList
                .forEach(Simulator::printObject);
    }
}
