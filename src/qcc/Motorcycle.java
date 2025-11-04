// ET 581 Homework 8, Problem 1, Student : Bianca Serpe Date 11/03/2025

package qcc;

//Concrete subclass Motorcycle
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

// Constructor to initialize Motorcycle attributes
    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }
// Implement abstract methods to provide Motorcycle-specific behavior
    @Override
    public void drive() {
        System.out.println("Motorcycle is speeding on the highway.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped safely.");
    }
}
