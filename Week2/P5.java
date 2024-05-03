// 5. Write a program to take two integer inputs from the user and print the sum and product of them.

package Week2;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Calculate the sum and product
        double sum = num1 + num2;
        double product = num1 * num2;
        
        // Print the sum and product
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
