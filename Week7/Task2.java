/*make attributes: name, brand, year, color
 * make a function modiify() that takes new color and set to old color
 * make a function expiry() that returns 100 added to year
 * make a function start() that prints(name is starting)
 * make a function stop() that prints(name is stoping)
 * make a function detail() that print(name, brand, color and year)
 * make 3 Object of Car
 * Start all 3 object
 * Stop only 1st objest
 * Modify 2nd car to Green color
 * Print the expiry of 3rd Object
 * Print detail of all 3 object
 */

package Week7;

public class Task2 {
    public static void main(String[] args) {
        // Creating three Car objects
        Car car1 = new Car("Car1", "Toyota", 2010, "Red");
        Car car2 = new Car("Car2", "Honda", 2015, "Blue");
        Car car3 = new Car("Car3", "Ford", 2020, "Black");

        // Starting all three cars
        car1.start();
        car2.start();
        car3.start();

        // Stopping only the first car
        car1.stop();

        // Modifying the color of the second car to Green
        car2.modify("Green");

        // Printing the expiry year of the third car
        System.out.println("Expiry year of " + car3.getName() + ": " + car3.expiry());

        // Printing the details of all three cars
        System.out.println("Details of Car 1:");
        car1.detail();
        System.out.println("Details of Car 2:");
        car2.detail();
        System.out.println("Details of Car 3:");
        car3.detail();
    }
}

class Car {
    // Attributes
    private String name;
    private String brand;
    private int year;
    private String color;

    // Constructor
    public Car(String name, String brand, int year, String color) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    // Method to modify the color of the car
    public void modify(String newColor) {
        this.color = newColor;
    }

    // Method to calculate the expiry year
    public int expiry() {
        return this.year + 100;
    }

    // Method to start the car
    public void start() {
        System.out.println(this.name + " is starting");
    }

    // Method to stop the car
    public void stop() {
        System.out.println(this.name + " is stopping");
    }

    // Method to print the details of the car
    public void detail() {
        System.out.println("Name: " + this.name + ", Brand: " + this.brand + ", Color: " + this.color + ", Year: " + this.year);
    }

    // Getter for the name attribute
    public String getName() {
        return name;
    }
}
