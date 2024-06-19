// 5. You are designing a car rental system, and you need to create a Car class.
// The Car class should have private instance variables for the car's make, model, and rental price per day.
// Implement appropriate getter and setter methods for these variables, ensuring that the make and model can only be set once during object creation.
// Additionally, include a private variable to track the availability of the car
// (e.g., true if available for rent, false if rented), and provide public methods to rent and return the car, updating its availability status.

package Week8;

// Main class to test the Car class
public class P5 {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 50.0);

        // Print car details
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Rental Price per Day: $" + car.getRentalPricePerDay());
        System.out.println("Available: " + car.isAvailable());

        // Rent the car
        car.rentCar();
        System.out.println("Available after renting: " + car.isAvailable());

        // Return the car
        car.returnCar();
        System.out.println("Available after returning: " + car.isAvailable());
    }
}

// Class to represent a car
class Car {
    // Private instance variables
    private String make;
    private String model;
    private double rentalPricePerDay;
    private boolean available;

    // Constructor to initialize the car make, model, and rental price per day
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.available = true; // Car is available by default
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for rental price per day
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    // Setter for rental price per day
    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Getter for availability
    public boolean isAvailable() {
        return available;
    }

    // Method to rent the car
    public void rentCar() {
        if (available) {
            available = false;
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is already rented.");
        }
    }

    // Method to return the car
    public void returnCar() {
        if (!available) {
            available = true;
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car is already available.");
        }
    }
}
