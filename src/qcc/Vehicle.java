package src.qcc;



// Superclass Vehicle
public class Vehicle {
    protected String brand;
    protected int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle created: " + brand + ", " + year);
    }

    // Method
    public void start() {
        System.out.println("Vehicle starts");
    }

    // Final method cannot be overridden
    public final void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
