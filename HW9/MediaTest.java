//ET 581 HW9 Problem 2 Student : Bianca Serpe Date: 11/08/2025

// Same as in Probem 1 , all classes are  in this single file for simplicity. The code works as intended.

// This program creates a list of various media items (Books, DVDs, CDs),
import java.util.*;

// Interface for readable items like Books 
interface Readable {
    void read();
}

// Interface for playable items like DVDs and CDs
interface Playable {
    void play();
}

// Abstract class for all media items like Books, DVDs, and CDs
abstract class MediaItem {
    public String title;

    // Constructor to initialize title
    public MediaItem(String title) {
        this.title = title;
    }

    // Abstract method to display information about the media item
    public abstract void displayInfo();
}

// Book class (implements Readable)
class Book extends MediaItem implements Readable {
    public Book(String title) {
        super(title);
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
    }

    public void read() {
        System.out.println("Reading book: " + title);
    }
}

// DVD class (implements Playable)
class DVD extends MediaItem implements Playable {
    public DVD(String title) {
        super(title);
    }

    public void displayInfo() {
        System.out.println("DVD Title: " + title);
    }

    public void play() {
        System.out.println("Playing DVD: " + title);
    }
}

// CD class (implements Playable)
class CD extends MediaItem implements Playable {
    public CD(String title) {
        super(title);
    }

    public void displayInfo() {
        System.out.println("CD Title: " + title);
    }

    public void play() {
        System.out.println("Playing CD: " + title);
    }
}

// Main class to test media items
public class MediaTest {
    public static void main(String[] args) {

        // Create list of media items ( I changed some titles for perrsonal preference)
        List<MediaItem> mediaList = new ArrayList<>();
        mediaList.add(new Book("Effective Java"));
        mediaList.add(new DVD("The Expanse"));
        mediaList.add(new CD("Best of 90s"));
        mediaList.add(new Book("Clean Code"));
        mediaList.add(new DVD("Interstellar Travel"));
        mediaList.add(new CD("Progressive Rock"));

        // Counters for each media type
        int bookCount = 0;
        int dvdCount = 0;
        int cdCount = 0;

        // Loop through media items and perform actions based on type
        for (MediaItem item : mediaList) {
            item.displayInfo();

            if (item instanceof Readable) {
                ((Readable) item).read();
                bookCount++;
            } else if (item instanceof DVD) {
                ((Playable) item).play();
                dvdCount++;
            } else if (item instanceof CD) {
                ((Playable) item).play();
                cdCount++;
            }

            System.out.println(); // blank line for readability
        }

        // Print totals
        System.out.println("📊 Summary:");
        System.out.println("Total Books: " + bookCount);
        System.out.println("Total DVDs: " + dvdCount);
        System.out.println("Total CDs: " + cdCount);
    }
}


