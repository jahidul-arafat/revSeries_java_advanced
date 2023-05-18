package scheduling;

import employee.Hairdresser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Scheduler {
    // create an instance variable of type HashMap<String, Hairesser>
    private HashMap<String, Hairdresser> hairdressers = new HashMap<String, Hairdresser>();

    // constructor with two hairdressers and add them to the hairdressers
    public Scheduler() {
        Hairdresser hairdresser1 = new Hairdresser("Haddon");
        Hairdresser hairdresser2 = new Hairdresser("Taddon");


        // set the hairdresser1 available days to be "sunday" and "Monday"
        hairdresser1.setDaysAvailable("sunday", "Monday");

        // set the hairdresser2 available days to be "sunday" and "Monday"
        hairdresser2.setDaysAvailable("wednesday","thursday","friday");

        // put both hairdressers into the hairdressers
        hairdressers.put(hairdresser1.getName(), hairdresser1);
        hairdressers.put(hairdresser2.getName(), hairdresser2);
    }

    // method to book the hairdressers by their name and day
    public void bookHaircut(String hairDresserName, String dayCustomerChooseForHairCut) {
        Hairdresser hairdresser = hairdressers.get(hairDresserName);

        // get the days the hairdress available to work
        List<String> daysAvailable = hairdresser.getDaysAvailable();
        // iterate throiugh the days available and convert all days to lowercase using stream api
        daysAvailable = daysAvailable
                .stream()
                .map(day -> day.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(daysAvailable);

        // check if the hairdresser is available for the day
        if (daysAvailable.contains(dayCustomerChooseForHairCut.toLowerCase())) {
            System.out.println(hairDresserName + " is available for " + dayCustomerChooseForHairCut);
            // print a stament that bookign for hairdresser on the day is successful
            System.out.println(hairDresserName + " is booked on " + dayCustomerChooseForHairCut);

            // remove this day from the hairdresser
            hairdresser.removeDay(dayCustomerChooseForHairCut);

        } else {
            System.out.println(hairDresserName + " is not available for " + dayCustomerChooseForHairCut);
        }
    }
}
