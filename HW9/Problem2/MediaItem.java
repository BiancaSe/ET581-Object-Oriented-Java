//ET581 Problem 2, Student: Bianca Serpe, Date: 11/08/2025

package Problem2;

//Abstract class for all media items
public abstract class MediaItem {
    public String title;


    // Constructor to initialize title
    public MediaItem(String title) {
        this.title = title;
    }


    // Abstract method to display information about the media item
    public abstract void displayInfo();
}
