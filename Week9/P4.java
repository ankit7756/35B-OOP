// 4. Design a class hierarchy for different types of vehicles. 
// Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'.
// Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'.
// Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.

package Week9;

public class P4 {
    public static void main(String[] args) {
        // Create a Car1 object
        Car1 myCar = new Car1("Toyota", "Corolla", 2022);
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();

        // Create a Motorcycle1 object
        Motorcycle1 myMotorcycle = new Motorcycle1("Harley-Davidson", "Sportster", 2020);
        myMotorcycle.startEngine();
        myMotorcycle.ride();
        myMotorcycle.stopEngine();
    }
}

// Base class Vehicle1 with startEngine() and stopEngine() methods
class Vehicle1 {
    private String make;
    private String model;
    private int year;

    // Constructor for Vehicle1 class
    public Vehicle1(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(make + " " + model + " engine started.");
    }

    public void stopEngine() {
        System.out.println(make + " " + model + " engine stopped.");
    }
}

// Car1 class extending Vehicle1 with a drive() method
class Car1 extends Vehicle1 {
    public Car1(String make, String model, int year) {
        super(make, model, year);
    }

    public void drive() {
        System.out.println("Driving the car.");
    }
}

// Motorcycle1 class extending Vehicle1 with a ride() method
class Motorcycle1 extends Vehicle1 {
    public Motorcycle1(String make, String model, int year) {
        super(make, model, year);
    }

    public void ride() {
        System.out.println("Riding the motorcycle.");
    }
}
