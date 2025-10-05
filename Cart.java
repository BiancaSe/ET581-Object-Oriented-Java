// ET 581 Homework 6 Task 2  Define Cart  & Task 3 Static Variables Student Bianca Serpe

// 1. create a Cart class 
public class Cart {

    // Array of Product to hold up to 5 products
    private Product[] products = new Product[5];

    // An integer to track number of products added
    private int count = 0;

    
    // 1. Add a static variable to track total number of carts created
    private static int totalCartNumber = 0;

    // 2.Constructor increments for when a new cart is created
    public Cart() {
        totalCartNumber++;
    }
 
        // Adding Methods
    // Method to add a product to the cart
    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        } else {
            System.out.println("Cart is full!");
        }
    }

    // Method to calculate total price of all products in the cart
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            if (products[i] != null) {
                total += products[i].getPrice();
            }
        }
        return total;
    }

    // Method to print all product names in the cart and total price
    public void showCart() {
        System.out.println("Cart contents:");
        for (int i = 0; i < count; i++) {
            if (products[i] != null) {
                System.out.println("- " + products[i].getName());
            }
        }
        System.out.println("Total: $" + calculateTotal());
        System.out.println();
    }

    // Adding a static method to print total number of carts created
    public static void printTotalCartNumber() {
        System.out.println("Total carts created: " + totalCartNumber);
    }
}
