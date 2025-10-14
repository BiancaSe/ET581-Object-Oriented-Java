package src.qcc;



// Subclass Car extending Vehicle
public class Car extends Vehicle {
    private int doors;

    // Constructor
    public Car(String brand, int year, int doors) {
        super(brand, year); // Call Vehicle constructor
        this.doors = doors;
        System.out.println("Car created: " + brand + ", doors: " + doors);
    }

    // Override start() method
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    // Uncommenting below will cause a compile error
    // because displayInfo() in Vehicle is final
    // @Override
    // public void displayInfo() { }
}
