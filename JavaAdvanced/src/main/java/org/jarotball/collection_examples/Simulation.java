package org.jarotball.collection_examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        /* Example-01: Create a LinkedList*/
        //linkedListOps();

        /*Example-02: Create a Queue with a List of customers; customer comes first will be served first*/
        /*FIFO*/
        //customerListOps();

        /*Example-03: Create a PhoneBook using HashMap*/
        /*HashMap is unordered*/
        /*
        * elements are stored by their keys, not by their position
        * HashMap does not allow duplicates
        * */
        // phoneBookHashMap();

        /*
        * HashMap with Order
        * */
        // create a LinkedHashMap
        LinkedHashMap<String, Integer> phoneBookOrdered= new LinkedHashMap<>();

        // add elements to the phoneBookOrdered
        phoneBookOrdered.put("Ailly", 12345);
        phoneBookOrdered.put("John",12213);
        phoneBookOrdered.put("Billy",12346);
        phoneBookOrdered.put("Cilly",12347);
        phoneBookOrdered.put("Dilly",12348);
        phoneBookOrdered.put("Eilly",12349);
        phoneBookOrdered.put("Frank",12350);
        phoneBookOrdered.put("Gilly",12351);

        // Print the list
        System.out.println(phoneBookOrdered.toString());

        // Print the size of the list
        System.out.println("Size: " + phoneBookOrdered.size());

        // add a null entry in the phoneBookOrdered
        phoneBookOrdered.put(null, 111111);

        // iterate over the phoneBookOrdered and print using Stream api and EntrySet
        phoneBookOrdered.entrySet()
                .stream()
                .forEach(entry -> {
                        System.out.println(entry.getKey() + " " + entry.getValue());
        });

        // iterate over the phoneBookOrdered and print using Stream api and EntrySet


    }

    private static void phoneBookHashMap() {
        HashMap<String, Integer> phoneBook = new HashMap<>();

        // add customers to the phoneBook; make sure the customers having name as key
        phoneBook.put("Ailly", 12345);
        phoneBook.put("John",12213);
        phoneBook.put("Billy",12346);
        phoneBook.put("Cilly",12347);
        phoneBook.put("Dilly",12348);
        phoneBook.put("Eilly",12349);
        phoneBook.put("Frank",12350);
        phoneBook.put("Gilly",12351);

        // create a hashmap entry with NULL as the key
        phoneBook.put(null, 111111);

        // Print the list
        System.out.println(phoneBook.toString());

        // Print the size of the list
        System.out.println("Size: " + phoneBook.size());


        // print the hashmap entry with Null as the key
        System.out.println(phoneBook.get(null));

        // check if the phoneBook contains a key with value
        System.out.println(phoneBook.containsKey("Ailly"));

        // check if the phoneBook contains a key with value
        System.out.println(phoneBook.containsKey("DDD"));

        // check if the phoneBook contains a key named "Ailly", if True, then remove the key
        if (phoneBook.containsKey("Ailly")) {
            System.out.println(phoneBook.remove("Ailly"));
        }

        // print the phoneBook
        System.out.println(phoneBook.toString());

        // remove all entries from the phoneBook
        phoneBook.clear();

        // print the phoneBook
        System.out.println(phoneBook.toString());
    }

    private static void customerListOps() {
        // create a list of Customers
        LinkedList<Customer> customers = new LinkedList<>();

        // Add customers to the list
        customers.add(new Customer("Ailly"));
        customers.add(new Customer("Billy"));
        customers.add(new Customer("Cilly"));
        customers.add(new Customer("Dilly"));
        customers.add(new Customer("Eilly"));

        // Print the list
        System.out.println(customers.toString());

        // Print the size of the list
        System.out.println("Size: " + customers.size());

        // Print the first element of the list
        System.out.println("First element: " + customers.getFirst());

        // Print the last element of the list
        System.out.println("Last element: " + customers.getLast());

        // server the first customer and then print the queue list again
        serveCustomer(customers);
        System.out.println(customers.toString());
    }

    // method to serve a list of customer and set the hasBeenServed boolean to true
    public static void serveCustomer(LinkedList<Customer> customers) {
        Customer customer = customers.poll();
        customer.setHasBeenServed(true);
        System.out.println(customer);
    }


    private static void linkedListOps() {
        // Create a linkedlist
        LinkedList<String> list = new LinkedList();

        // Add elements to the list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Print the list
        System.out.println(list.toString());

        // Print the size of the list
        System.out.println("Size: " + list.size());

        // Print the first element of the list
        System.out.println("First element: " + list.getFirst());

        // Print the last element of the list
        System.out.println("Last element: " + list.getLast());

        // Remove the first element of the list
        list.removeFirst();

        // Print the list
        System.out.println(list.toString());

        // Remove the last element of the list
        list.removeLast();

        // Print the list
        System.out.println(list);

        // poll the first element of the queue
        System.out.println(list.poll());

        // print the list
        System.out.println(list.toString());

        // peek the first element of the queue
        System.out.println(list.peek());

        // Print the list
        System.out.println(list);

        //delete all elements from the linkedlist
        list.clear();

        // Print the list
        System.out.println(list.toString());
    }
}
