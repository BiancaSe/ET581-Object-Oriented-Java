
// ET581 Homework 10 Problem 2 - Sort Custom class (Book) , Student: Bianca Serpe, Date: 11/17/2025


// Homework 10 - Problem 2
// Simple Book class implementing Comparable so books sort by title

public class Book implements Comparable<Book> {
    String title;
    double price;

    // Constructor to set fields and 
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // compareTo will sort books alphabetically by title
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // toString makes printing easier
    public String toString() {
        return title + " ($" + price + ")";
    }
}

