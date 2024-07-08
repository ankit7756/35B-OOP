// 3. Create a Shopping Cart class to simulate an online shopping cart. 
// The class should have the following attributes: cart ID, customer name, and items (a list of products). 
// Include methods to addItem(), removeltem(), and calculate Total(). Implement functionality to create new shopping carts, 
// add/remove items, and calculate the total cost of items in the cart.

package Week14;

import java.util.ArrayList;
import java.util.List;

public class P3 {
    public static void main(String[] args) {
        // Creating a new shopping cart
        ShoppingCart cart = new ShoppingCart("CART1001", "John Doe");

        // Adding items to the cart
        cart.addItem("Laptop", 800.0);
        cart.addItem("Headphones", 50.0);
        cart.addItem("Mouse", 25.0);

        // Removing an item from the cart
        cart.removeItem("Headphones");

        // Calculating the total cost of items in the cart
        double total = cart.calculateTotal();
        System.out.println("Total Cost: $" + total);

        // Printing the cart details
        cart.printCartDetails();
    }
}

class ShoppingCart {
    // Attributes
    private String cartID;
    private String customerName;
    private List<Item> items;

    // Constructor to initialize the shopping cart
    public ShoppingCart(String cartID, String customerName) {
        this.cartID = cartID;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price) {
        items.add(new Item(itemName, price));
        System.out.println("Added: " + itemName + " - $" + price);
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
        System.out.println("Removed: " + itemName);
    }

    // Method to calculate the total cost of items in the cart
    public double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Method to print the cart details
    public void printCartDetails() {
        System.out.println("Cart ID: " + cartID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Items in Cart:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
    }

    // Inner class to represent an item in the shopping cart
    class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
