package src.qcc;


// Library class
public class Library {

    // Instance initializer block — runs before constructor
    {
        System.out.println("Library instance block executed");
    }

    // Method returning a Book object
    public Book getBook() {
        return new Book("Unknown", 10.0);
    }
}
