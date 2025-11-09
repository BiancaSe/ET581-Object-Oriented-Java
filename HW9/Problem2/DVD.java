// ET581 Problem 2, Student: Bianca Serpe, Date: 11/08/2025

package Problem2;

// DVD class implements Playable
 
public class DVD extends MediaItem implements Playable {
    public DVD(String title) {
        super(title);
    }

    // Implement displayInfo method
    public void displayInfo() {
        System.out.println("DVD Title: " + title);
    }


    // Implement play method
    public void play() {
        System.out.println("Playing DVD: " + title);
    }
}
