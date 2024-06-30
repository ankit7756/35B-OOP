// 3. You are developing a car rental system. 
// There are different types of vehicles available for rent, such as cars, motorcycles, and bicycles. 
// Each vehicle type has different rental calculation rules. 
// Implement a Java program using polymorphism to calculate the rental cost for different vehicle types.

package Week11;

public class P3 {
    public static void main(String[] args) {
        Vehicle c1 = new Car(1000);
        Vehicle m1 = new Motorcycle(500);
        Vehicle b1 = new Bicycle(250);

        System.out.println("The total rental cost of Car for 3 days is: " + c1.calculateRentalCost(2) );
        System.out.println("The total rental cost of Motorcycle for 20 days is: " + m1.calculateRentalCost(20) );
        System.out.println("The total rental cost of Bicycle for 9861 days is: " + b1.calculateRentalCost(9861));     
    } 
}

abstract class Vehicle {
    abstract double calculateRentalCost (int days);
   
}

class Car extends Vehicle {
    private double dailyRate;

    public Car(double dailyRate){
        this.dailyRate = dailyRate;
    }
    double calculateRentalCost (int days) {
        return days * dailyRate;
    }
}

class Motorcycle extends Vehicle {
    private double dailyRate;

    public Motorcycle (double dailyRate){
        this.dailyRate = dailyRate;
    }
    double calculateRentalCost (int days) {
        return days * dailyRate;
    }
}

class Bicycle extends Vehicle {
    private double hourlyRate;

    public Bicycle (double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    double calculateRentalCost (int hours){
        return hours * hourlyRate;
    }
}