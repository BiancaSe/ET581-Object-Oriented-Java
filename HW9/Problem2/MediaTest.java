// ET 581 HW9 Problem 2 Student : Bianca Serpe Date: 11/08/2025


package Problem2;

// Main class for Problem 2 Creates a list of media items and demonstrates OOP concepts
 
// Import necessary classes
import java.util.*;

// Import MediaItem, Book, DVD, CD, Readable, and Playable classes
public class MediaTest {

// Main method to run the media test
    public static void main(String[] args) {
        List<MediaItem> mediaList = new ArrayList<>();

        // Added various media items to the list (I changed some titels for favorite preferences)
        mediaList.add(new Book("Effective Java"));
        mediaList.add(new DVD("The Expanse"));
        mediaList.add(new CD("Best of 90s"));
        mediaList.add(new Book("Clean Code"));
        mediaList.add(new DVD("Interstellar Travel"));
        mediaList.add(new CD("Progressive Rock"));

// Counters for each media type
        int bookCount = 0, dvdCount = 0, cdCount = 0;

// Iterate through the media list and display info and perform actions based on type
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

            System.out.println();
        }

        System.out.println("📊 Summary:");
        System.out.println("Total Books: " + bookCount);
        System.out.println("Total DVDs: " + dvdCount);
        System.out.println("Total CDs: " + cdCount);
    }
}
