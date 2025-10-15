package qcc;


// Superclass Library 
// It demonstates instance initilazer block & method returning a Book
public class Library {

    // Instance initializer block (runs evry time before constructor of this class or its subclass
    
    {
        System.out.println("Library instance block executed");
    }

    // Method returning a Book object
    public Book getBook() {
        return new Book("Unknown", 10.0);
    }
}
