// ET 581 Homework 8, Problem 1 , Student : Bianca Serpe Date 11/03/2025
package qcc;


//Abstract base class Vehicle
public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor to initialize Vehicle attributes
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // concrete Method to start the vehicle
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void drive();
    public abstract void stop();
}
