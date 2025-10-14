package src.qcc;



// Driver class demonstrating HAS-A relationship (aggregation)
public class Driver {
    private String name;
    private Vehicle vehicle; // HAS-A Vehicle

    // Constructor
    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    // Method that uses the Vehicle object
    public void drive() {
        vehicle.start();
        System.out.println("Driver " + name + " is driving");
    }
}
