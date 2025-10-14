package src.qcc;


// Subclass EBook extending Book
public class EBook extends Book {
    private double fileSize; // in MB

    // Constructor
    public EBook(String title, double price, double fileSize) {
        super(title, price); // call Book constructor
        this.fileSize = fileSize;
    }

    // Override showInfo() to include file size
    @Override
    public void showInfo() {
        System.out.println("EBook: " + title + ", Price: $" + price + ", File Size: " + fileSize + "MB");
    }

    // Additional method
    public double getFileSize() {
        return fileSize;
    }
}
