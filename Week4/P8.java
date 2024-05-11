// 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
//  For example, if the input is 12345, the output should be 54321.

package Week4;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        scanner.close();
        
        // Call the reverseNumber method and print the reversed number
        System.out.println("Reversed number: " + reverseNumber(number));
    }
    
    // Method to reverse the digits of a given integer
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        
        // Loop through each digit of the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversedNumber
            number /= 10; // Remove the last digit from the number
        }
        
        return reversedNumber;
    }
}

//without using methods

// import java.util.Scanner;

// public class P8 {
//     public static void main(String[] args) {
//         // Create a Scanner object to read input from the user
//         Scanner scanner = new Scanner(System.in);
        
//         // Prompt the user to enter an integer
//         System.out.print("Enter an integer: ");
        
//         // Read the integer input from the user
//         int number = scanner.nextInt();
        
//         // Close the Scanner object to prevent resource leak
//         scanner.close();
        
//         // Variable to store the reversed number
//         int reversedNumber = 0;
        
//         // Loop to reverse the digits of the entered number
//         while (number != 0) {
//             int digit = number % 10; // Extract the last digit
//             reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversedNumber
//             number /= 10; // Remove the last digit from the number
//         }
        
//         // Print the reversed number
//         System.out.println("Reversed number: " + reversedNumber);
//     }
// }


