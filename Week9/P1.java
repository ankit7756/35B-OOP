// 1. Write a Java program to create a class called Vehicle with a method called drive().
// Create a subclass called Car with method display() method to print details of the Car.

package Week9;

public class P1 {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Corolla", 2022);

        // Call the drive method from the Vehicle class
        myCar.drive();

        // Call the display method from the Car class
        myCar.display();
    }
}

// Vehicle class with a drive method
class Vehicle {
    // Method to simulate driving the vehicle
    public void drive() {
        System.out.println("The vehicle is being driven.");
    }
}

// Car subclass extending Vehicle class
class Car extends Vehicle {
    private String make;
    private String model;
    private int year;

    // Constructor for Car class
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void display() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
