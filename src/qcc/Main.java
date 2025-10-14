package src.qcc;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Problem 1: Vehicles and Drivers ===");
        Vehicle v = new Vehicle("Generic Vehicle", 2020);
        Car c = new Car("Toyota", 2023, 4);
        Driver d1 = new Driver("Alice", v);
        Driver d2 = new Driver("Bob", c);

        v.start(); // Vehicle starts
        c.start(); // Car starts
        d1.drive();
        d2.drive();

        System.out.println("\n=== Problem 2: Book and Library System ===");
        Book b1 = new EBook("AI in Education", 12.5, 1.8);
        b1.showInfo(); // Calls overridden method

        Library lib = new DigitalLibrary(); // instance block runs
        Book b2 = lib.getBook();
        b2.showInfo(); // Shows eBook info

        System.out.println("Program finished.");
    }
}
