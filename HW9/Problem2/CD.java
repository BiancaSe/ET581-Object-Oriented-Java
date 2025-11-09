// ET581 Problem 2, Student: Bianca Serpe, Date: 11/08/2025

package Problem2;

// CD class implements Playable
 
public class CD extends MediaItem implements Playable {
    public CD(String title) {
        super(title);
    }

    // Implement displayInfo method
    public void displayInfo() {
        System.out.println("CD Title: " + title);
    }


    // Implement play method
    public void play() {
        System.out.println("Playing CD: " + title);
    }
}
