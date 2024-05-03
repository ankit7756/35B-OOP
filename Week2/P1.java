// 1. Write a program to check whether a person can cast a vote or not. 
// The condition is you must be over 18 years old to vote.

package Week2;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}


