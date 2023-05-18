package org.jarotball.functional_programming;

import java.util.ArrayList;
import java.util.List;

public class BookSim {
    public static void main(String[] args) {
        // Create a List of Books
        List<Book> books = new ArrayList<Book>();

        // add books into the list
        books.add(new Book("Java Programming", "Joshua Bloch", 100));
        books.add(new Book("Oracle Programming", "ARafat", 2000));
        books.add(new Book("C Programming", "Joshua Bloch", 300));
        books.add(new Book("RUST Programming", "Joshua Bloch", 100));

        /*list of books starts with "J"*/
        // iterate through the books and filter the books starts with "J" using stream api
        books
                .stream()
                .map(book -> book.getName().toLowerCase())
                .filter(book -> book.startsWith("j")).forEach(System.out::println);


        /*list of books filtered by Title and Author name*/
        // iterate through the books and filter the books name starts with "J" and author starts with "A"
        books
                .stream()
                .map(book -> book.getName().toLowerCase())
                .filter(book -> book.startsWith("j"))
                .filter(book -> book.startsWith("a"))
                .forEach(System.out::println);


        /*List of books of a specific author*/
        // iterate through the books and filter the books by author name "Arafat"
        books
                .stream()
                .map(book -> book.getAuthor().toLowerCase())
                .filter(book -> book.contains("arafat")).forEach(System.out::println);

        /*List of books in a price range*/
        // iterate through the books and filter the books by price between 100 and 500
        books
                .stream()
                .filter(book -> book.getPrice() >= 100 && book.getPrice() <= 500)
                .map(book -> book.getName() + "," + book.getAuthor() + "::" + book.getPrice())
                .forEach(System.out::println);

    }
}
