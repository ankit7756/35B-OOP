// 2. Write a Java program to create a class called “Simple Interest” 
// with a data fields principle, time and rate, using setter getter method and print the values.

package Week7;

public class P2 {
    public static void main(String[] args) {
        // Create a SimpleInterest object
        SimpleInterest si = new SimpleInterest();

        // Set the values using setter methods
        si.setPrinciple(1000.0);
        si.setTime(2.0);
        si.setRate(5.0);

        // Get and print the values using getter methods
        System.out.println("Principle: " + si.getPrinciple());
        System.out.println("Time: " + si.getTime());
        System.out.println("Rate: " + si.getRate());

        // Calculate and print the simple interest
        double interest = si.calculateSimpleInterest();
        System.out.println("Simple Interest: " + interest);
    }
}

class SimpleInterest {
    // Private attributes
    private double principle;
    private double time;
    private double rate;

    // Setter method for principle
    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    // Getter method for principle
    public double getPrinciple() {
        return principle;
    }

    // Setter method for time
    public void setTime(double time) {
        this.time = time;
    }

    // Getter method for time
    public double getTime() {
        return time;
    }

    // Setter method for rate
    public void setRate(double rate) {
        this.rate = rate;
    }

    // Getter method for rate
    public double getRate() {
        return rate;
    }

    // Method to calculate simple interest
    public double calculateSimpleInterest() {
        return (principle * rate * time) / 100;
    }
}

