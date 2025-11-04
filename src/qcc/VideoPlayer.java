// ET 581 Homework 8, Problem 2 Student : Bianca Serpe Date 11/03/2025
package qcc;

// Class implementing Playable to define video player behavior
public class VideoPlayer implements Playable {
   //Override methods from Playable interface
    @Override
    public void play() {
        System.out.println("Playing video...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing video...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video.");
    }
}
