// ET 581 Homework 6, 

package qcc;

// Main test class, it tests both Problem 1 and 2, coded as per HM instructions
public class Main {
    public static void main(String[] args) {

        // Problem 1: Vehicles and Drivers 

        System.out.println("=== Problem 1: Vehicles and Drivers ===");
        
        // Create Vehicle and Car objects as per HW instructions
        Vehicle v = new Vehicle("Generic Vehicle", 2020);
        Car c = new Car("Toyota", 2023, 4);
       
       // Create Driver objects, each with a Vehicle
        Driver d1 = new Driver("Alice", v);
        Driver d2 = new Driver("Bob", c);

        // Test method overriding 
        v.start(); // Vehicle starts
        c.start(); // Car starts (overriden method)

        // Test HAS-A relationship and polymorphism
        d1.drive(); // Uses Vehicle start()
        d2.drive(); // Uses Car start()

        // Problem 2: Book ans Library System

        System.out.println("\n=== Problem 2: Book and Library System ===");
       
       // Create EBook (subclass of Book)
        Book b1 = new EBook("AI in Education", 12.5, 1.8);
        b1.showInfo(); // Calls overridden showInfo() method in EBook

        // Create Library and DigitalLibrary

        Library lib = new DigitalLibrary(); // triggers instance initializer block 
       
       // Demonstrates covariant return type (EBook returnred as Book reference)
        Book b2 = lib.getBook();
        b2.showInfo(); // Shows eBook info

        System.out.println("Program finished.");
    }
}
