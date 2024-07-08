// 9. Write a program that prompts the user to enter five integer values and reads them into an array. 
// The program should consist of the following methods:

// - a method named "max" that reads an array of integer values and returns the maximum value
// - a method named "indexOfHighest" that returns the index of the highest element in an array of integers. If more than one such element exists, return the smallest index. Invoke the above methods and demonstrate them in the program.

package Week14;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Prompt user to enter five integers
        System.out.println("Enter five integer values:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Call max method to find the maximum value
        int maxNumber = max(numbers);
        System.out.println("Maximum value in the array: " + maxNumber);

        // Call indexOfHighest method to find the index of the highest element
        int indexOfHighest = indexOfHighest(numbers);
        System.out.println("Index of the highest value: " + indexOfHighest);

        scanner.close();
    }

    // Method to find the maximum value in the array
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the index of the highest element in the array
    public static int indexOfHighest(int[] arr) {
        int max = arr[0];
        int indexOfMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
