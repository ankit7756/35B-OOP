// 4. You are developing a restaurant management system and want to create a Menu class.
// The Menu class should encapsulate a list of MenuItem objects.
// Implement the Menu class with private instance variables for the menu items 
// and provide public methods to add and remove items from the menu. 
// Ensure that the list of menu items cannot be directly accessed or modified from outside the class.

package Week8;

public class P4 {
    public static void main(String[] args) {
        // Create a Menu object
        Menu menu = new Menu();

        // Add items to the menu
        menu.addItem1("Pizza");
        menu.addItem2("Burger");
        menu.addItem3("Pasta");

        // Print the menu
        System.out.println("Menu items:");
        menu.printMenu();

        // Remove an item from the menu
        menu.removeItem2();

        // Print the menu after removal
        System.out.println("Menu items after removal:");
        menu.printMenu();
    }
}

class Menu {
    // Private attributes for menu items
    private String item1;
    private String item2;
    private String item3;

    // Methods to add items to the menu
    public void addItem1(String item) {
        item1 = item;
    }

    public void addItem2(String item) {
        item2 = item;
    }

    public void addItem3(String item) {
        item3 = item;
    }

    // Methods to remove items from the menu
    public void removeItem1() {
        item1 = null;
    }

    public void removeItem2() {
        item2 = null;
    }

    public void removeItem3() {
        item3 = null;
    }

    // Method to print the menu
    public void printMenu() {
        if (item1 != null) {
            System.out.println(item1);
        }
        if (item2 != null) {
            System.out.println(item2);
        }
        if (item3 != null) {
            System.out.println(item3);
        }
    }
}



// Program using array approach:

// import java.util.ArrayList;
// import java.util.List;

// // Main class to test the Menu and MenuItem classes
// public class P4 {
//     public static void main(String[] args) {
//         // Create some menu items
//         MenuItem item1 = new MenuItem("Burger", 5.99);
//         MenuItem item2 = new MenuItem("Pizza", 8.99);
//         MenuItem item3 = new MenuItem("Pasta", 7.99);

//         // Create a menu and add items to it
//         Menu menu = new Menu();
//         menu.addItem(item1);
//         menu.addItem(item2);
//         menu.addItem(item3);

//         // Display the menu
//         System.out.println("Menu:");
//         for (MenuItem item : menu.getItems()) {
//             System.out.println(item.getName() + " - $" + item.getPrice());
//         }

//         // Remove an item from the menu
//         menu.removeItem(item2);

//         // Display the updated menu
//         System.out.println("\nUpdated Menu:");
//         for (MenuItem item : menu.getItems()) {
//             System.out.println(item.getName() + " - $" + item.getPrice());
//         }
//     }
// }

// // Class to represent a menu item
// class MenuItem {
//     private String name;
//     private double price;

//     // Constructor to initialize a menu item
//     public MenuItem(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }

//     // Getter for name
//     public String getName() {
//         return name;
//     }

//     // Setter for name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // Getter for price
//     public double getPrice() {
//         return price;
//     }

//     // Setter for price
//     public void setPrice(double price) {
//         this.price = price;
//     }
// }

// // Class to represent the menu containing menu items
// class Menu {
//     // Private list to hold menu items
//     private List<MenuItem> items;

//     // Constructor to initialize the menu
//     public Menu() {
//         items = new ArrayList<>();
//     }

//     // Method to add an item to the menu
//     public void addItem(MenuItem item) {
//         items.add(item);
//     }

//     // Method to remove an item from the menu
//     public void removeItem(MenuItem item) {
//         items.remove(item);
//     }

//     // Method to get the list of menu items
//     public List<MenuItem> getItems() {
//         return new ArrayList<>(items); // Return a copy to ensure encapsulation
//     }
// }
