package src.qcc;



/** Superclass/ Parent Vehicle / it defines  constructors, 
 * final method (no subclass can override), inheritance */

public class Vehicle {
    // Fields (instance variables)
    protected String brand;   // accesible by subclass
    protected int year;

    // Constructor: runs when a new Vehicle is created
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle created: " + brand + ", " + year);
    }

    // Regular Method that can be overriden (not static or final)
    public void start() {
        System.out.println("Vehicle starts");
    }

    // Final method cannot be overridden in subclasses
    // Demonstates the use of "final" keyword
    public final void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
