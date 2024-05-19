// Write a Java program to calculate the average value of array element.

package Week6;

// public class P1 {
//     public static void main(String[] args) {
//         // Define an array with some numbers
//         int[] numbers = {5, 10, 15, 20, 25};

//         // Variable to store the sum of array elements
//         int sum = 0;

//         // Loop through each element in the array to calculate the sum
//         for (int i = 0; i < numbers.length; i++) {
//             sum += numbers[i];
//         }

//         // Calculate the average
//         double average = (double) sum / numbers.length;

//         // Print the average
//         System.out.println("The average value of the array elements is: " + average);
//     }
// }

// same program using scanner

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to hold the elements
        int[] numbers = new int[n];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Variable to store the sum of array elements
        int sum = 0;

        // Loop through each element in the array to calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the average
        System.out.println("The average value of the array elements is: " + average);

        // Close the scanner
        scanner.close();
    }
}
