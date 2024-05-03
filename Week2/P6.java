// 6. Take two integer inputs from the user. 
// First, calculate the sum of two, then the product of two.
//  Finally, calculate the division of the thus obtained sum and product and print the result.

package Week2;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Calculate the sum of the two numbers
        double sum = num1 + num2;
        
        // Calculate the product of the two numbers
        double product = num1 * num2;
        
        // Calculate the division of the sum and product
        double division = sum / product;
        
        // Print the sum
        System.out.println("Sum: " + sum);
        
        // Print the product
        System.out.println("Product: " + product);
        
        // Print the division result
        System.out.println("Division of sum and product: " + division);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}


