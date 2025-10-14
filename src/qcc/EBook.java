package src.qcc;


// Subclass EBook extending Book. It adds new field & overrides showInfo()
public class EBook extends Book {
    private double fileSize; // file size in MB

    // Constructor calling parent constructor with super()& then intitializes fileSize
    public EBook(String title, double price, double fileSize) {
        super(title, price); // call Book constructor
        this.fileSize = fileSize;
    }

    // Override showInfo() to include file size in the output
    @Override
    public void showInfo() {
        System.out.println("EBook: " + title + ", Price: $" + price + ", File Size: " + fileSize + "MB");
    }

    // Additional method to access file size
    public double getFileSize() {
        return fileSize;
    }
}
