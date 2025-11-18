
// ET581 Homework 10 Problem 2 - Sort Custom class (BookSortMain) , Student: Bianca Serpe, Date: 11/17/2025


import java.util.*;


// Sort books by title using Comparable build-in interface  and the Collections.sort() method

public class BookSortMain {
    public static void main(String[] args) {

        // Create the list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 39.99));
        books.add(new Book("Algorithms", 49.50));
        books.add(new Book("Data Structures", 29.75));
        books.add(new Book("Operating Systems", 59.00));

      // Sorting the list of Book objects in-place using the natural ordering

        Collections.sort(books);

        // Print in sorted order
        System.out.println("Sorted by Title (A–Z):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

