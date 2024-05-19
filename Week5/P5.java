// 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.

package Week5;

import java.util.Scanner;

public class P5 {

    // Method to calculate Simple Interest
    public static void calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Principal Amount: $" + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: $" + simpleInterest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble(); // Principal amount in dollars

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble(); // Rate of interest in percent

        System.out.print("Enter Time Period (in years): ");
        double time = scanner.nextDouble(); // Time period in years

        // Close the scanner
        scanner.close();

        // Call the method to calculate Simple Interest
        calculateSimpleInterest(principal, rate, time);
    }
}
