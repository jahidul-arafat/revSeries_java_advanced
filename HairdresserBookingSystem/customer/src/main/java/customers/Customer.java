package customers;

import scheduling.Scheduler;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Let the customer book a hairdress on a specific day");
        // create a scheduler object
        Scheduler scheduler = new Scheduler();

        // lets schedule to book hairdresser "Haddon" on sunday
        scheduler.bookHaircut("Haddon", "Sunday");

        // lets schedule to book hairdresser "Haddon" on monday
        scheduler.bookHaircut("Haddon", "Monday");

        // lets schedule to book hairdresser "Haddon" on tuesday
        scheduler.bookHaircut("Haddon", "Tuesday");

    }
}
