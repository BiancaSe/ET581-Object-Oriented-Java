// ET 581 Homework 6, Task 1 Define Product   Student Bianca Serpe



public class Product {  // defining the class "Product"
    private String name;   // instace variables storing the product's name & price
    private double price;


// Adding the constructer to initialize the fields
    public Product(String n, double p) {
        name = n;
        price = p;
    }
 // Adding the getter and setter methods for the price
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public String getName() {
        return name;
    }
}
