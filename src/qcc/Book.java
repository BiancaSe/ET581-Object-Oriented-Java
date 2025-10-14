
// ET 581 Homework 7 

package src.qcc;


// Base class Book
public class Book {
    protected String title;
    protected double price;

    // Constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Method to display info
    public void showInfo() {
        System.out.println("Book: " + title + ", Price: $" + price);
    }
}

