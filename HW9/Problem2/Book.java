// ET581 Problem 2, Student: Bianca Serpe, Date: 11/08/2025

package Problem2;

// Book class implements Readable
 
public class Book extends MediaItem implements Readable {
    public Book(String title) {
        super(title);
    }

    // Implement displayInfo method
    public void displayInfo() {
        System.out.println("Book Title: " + title);
    }

    // Implement read method
    public void read() {
        System.out.println("Reading book: " + title);
    }
}

    

