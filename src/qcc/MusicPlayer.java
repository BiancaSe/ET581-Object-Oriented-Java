// ET 581 Homework 8,Problem 2,  Student : Bianca Serpe Date 11/03/2025

package qcc;

//Class implementing Playable interface
public class MusicPlayer implements Playable {
    // Override methods to provide MusicPlayer-specific behavior
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");

    }
    
}
