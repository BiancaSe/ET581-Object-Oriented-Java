package qcc;



/*  This class demonstrates  HAS-A relationship (aggregation)
 A driver "has a" Vehicle , the Driver uses Vehicle methods 
but it is not a Vehicle */ 

public class Driver {
    private String name;
    private Vehicle vehicle; // HAS-A Vehicle

    // Constructor: takes a name and a vehicle object
    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    // Method that uses the Vehicle object
    // Calls the vehicle's start() method, then prints a message
    public void drive() {
        vehicle.start();     //Polymorphism (calls the correct start() depending on the object type
        System.out.println("Driver " + name + " is driving");
    }
}
