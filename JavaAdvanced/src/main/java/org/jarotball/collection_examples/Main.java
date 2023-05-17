package org.jarotball.collection_examples;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        // create a linkedHashMap with size 4 and loadfactor 75% and ordering is false
        /*entries at most recent at bottom*/
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(4, 0.75f, false);
        map.put("Kevin",123455);
        map.put("Jill",33434345);
        map.put("Aane",234234);
        map.put("John",12345);

        // print the Kevin's number
        System.out.println(map.get("Kevin"));



        // iterate over the map and print using stream api and entryset
        map.entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));


    }
}
