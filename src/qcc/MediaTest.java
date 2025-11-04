// ET 581 Homework 8, Problem 2,  Student : Bianca Serpe Date 11/03/2025
package qcc;


// Testing class for Playable implementations
public class MediaTest {
    public static void main(String[] args) {
        // Create an array of Playable objects
        Playable[] players = new Playable[2];
        players[0] = new MusicPlayer(); // Instantiate MusicPlayer
        players[1] = new VideoPlayer(); // Instantiate VideoPlayer

// Iterate through the array and demonstrate polymorphic behavior
        for (Playable p : players) {
            System.out.println("\n--- New Player ---");
            p.play(); //Call play method
            p.pause(); //Call pause method
            p.stop(); //Call stop method
        }
    }
}
