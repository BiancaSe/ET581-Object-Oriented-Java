package src.qcc;



// Subclass Car extending (inherits from) Vehicle
// Demonstrates: inheritence super(), overriding
public class Car extends Vehicle {
    private int doors;  // number of doors for the car

    // Constructor calls the Superclas (Vehicle) consturctor using super()
    public Car(String brand, int year, int doors) {
        super(brand, year); 
        this.doors = doors;
        System.out.println("Car created: " + brand + ", doors: " + doors);
    }

    // Override start() method of Vehicle
    // This changes the behavior specifically for Car objects
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    // If we try to override  displayInfo() the compiler would give us an error
    // because displayInfo() in Vehicle is final
    
}
