// 4. You are working on a restaurant ordering system. 
// There are different types of menu items, such as appetizers, main courses, and beverages. 
// Each menu item has its own preparation and serving methods. 
// Implement a Java program using polymorphism to handle the ordering and preparation of different types of menu items.

package Week11;

public class P4 {
    public static void main(String[] args) {
        // Create instances of different menu items
        MenuItem appetizer = new Appetizer();
        MenuItem mainCourse = new MainCourse();
        MenuItem beverage = new Beverage();

        // Process orders for different menu items
        orderItem(appetizer);
        orderItem(mainCourse);
        orderItem(beverage);
    }

    // Method to order and process a menu item
    public static void orderItem(MenuItem item) {
        item.prepare();
        item.serve();
    }
}

class MenuItem {
    // Method for preparing the menu item
    public void prepare() {
        System.out.println("Preparing the menu item...");
    }

    // Method for serving the menu item
    public void serve() {
        System.out.println("Serving the menu item...");
    }
}

// Subclass Appetizer extending MenuItem
class Appetizer extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Preparing the appetizer...");
    }

    @Override
    public void serve() {
        System.out.println("Serving the appetizer...");
    }
}

// Subclass MainCourse extending MenuItem
class MainCourse extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Preparing the main course...");
    }

    @Override
    public void serve() {
        System.out.println("Serving the main course...");
    }
}

// Subclass Beverage extending MenuItem
class Beverage extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Preparing the beverage...");
    }

    @Override
    public void serve() {
        System.out.println("Serving the beverage...");
    }
}

