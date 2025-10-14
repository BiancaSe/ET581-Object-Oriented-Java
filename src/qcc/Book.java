
package src.qcc;


// Superclass Book, it demonstartes inheritence base for EBook
public class Book {
    protected String title;
    protected double price;

    // Constructor that initializes title and price
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Method to display info
    public void showInfo() {
        System.out.println("Book: " + title + ", Price: $" + price);
    }
}

