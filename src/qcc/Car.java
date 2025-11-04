// ET 581 Homework 8, Problem 1, Student : Bianca Serpe Date 11/03/2025

package qcc;

//Concrete subclass Car
public class Car extends Vehicle {
    private int numberOfDoors;

// Constructor to initialize Car attributes
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }
// Implement abstract methods to provide Car-specific behavior
    @Override
    public void drive() {
        System.out.println("Car is driving smoothly.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped at the traffic light.");
    }
}
