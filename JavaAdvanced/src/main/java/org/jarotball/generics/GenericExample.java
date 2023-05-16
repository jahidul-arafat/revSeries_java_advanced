package org.jarotball.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        // List of string without generic
        // It will become List<Object> without specifying the generic
        List strList = new ArrayList();
        strList.add("Ailly");
        strList.add("Billy");
        strList.add("Cilly");
        strList.add(10);

        // get the list length
        System.out.println(strList.get(strList.size() - 1));
        var i = (String) strList.get(strList.size() - 2);
        System.out.println(i + 1);

        // List of string with generic
        List<String> strListGeneric = new ArrayList<String>();
        strListGeneric.add("Ailly");
        strListGeneric.add("Billy");
        strListGeneric.add("Cilly");
        //strListGeneric.add(10); // see, you cant add raw 10 now in the code


        // define an array of characters, one array of integers and one array of booleans
        // Make sure the data types are wrapper classes i.e. Integer, Boolean, Character, String
        // should not be primitive data types i.e. int, char, boolean
        Character[] chars = {'A', 'B', 'C', 'D', 'E'};
        Integer[] ints = {1, 2, 3, 4, 5};
        Boolean[] bools = {true, false, true, false, true};

        // define an array of strings
        String[] strings = {"A", "B", "C", "D", "E"};

        // convert the array of string to List of strings
        List<String> stringList = Arrays.asList(strings);
        System.out.println(stringList);

        //
        List<Integer> intList = Arrays.asList(ints);
        System.out.println(intList);

        List<Boolean> boolList = Arrays.asList(bools);
        System.out.println(boolList);

        // define a new char array
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};

        // convert the char array to List of Character
        Character[] charArr = {'A', 'B', 'C', 'D', 'E'};
        List<Character> charList = arrayToList(charArr);
        System.out.println(charList);

        List<Integer> intList2 = arrayToList(ints);
        System.out.println(intList2);

    }

    private static void arrayToListChar(char[] charArr) {
        List<Character> charList = new ArrayList<>();
        for (char ch : charArr) {
            charList.add(ch);
        }
        System.out.println(charList);
    }

    // create a method named arrayToList with generic type T and two parameters one for T type array The return type would be List of type T
    private static <T> List<T> arrayToList(T[] arr) {
        List<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        return list;
    }





}