// ET 581 Homework 8,Problem 2 Student : Bianca Serpe Date 11/03/2025

package qcc;

//Test class to demonstrate Vehicle, Car, and Motorcycle functionality
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota", "Camry", 2021, 4);
        vehicles[1] = new Motorcycle("Harley-Davidson", "Street 750", 2022, false);

// Iterate through the array and demonstrate polymorphic behavior
        for (Vehicle v : vehicles) {
            System.out.println("\n--- " + v.brand + " " + v.model + " ---");
            v.start();
            v.drive();
            v.stop();
        }
    }
}

