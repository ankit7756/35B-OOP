// Write a Java program to find the maximum and minimum value in an array.

package Week6;

public class P3 {
    public static void main(String[] args) {
        // Define an array with some elements
        int[] numbers = {5, 8, 12, 3, 9, 15, -1, 7};

        // Initialize variables to store the maximum and minimum values
        int max = numbers[0];
        int min = numbers[0];

        // Loop through the array to find the max and min values
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is greater
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if current element is smaller
            }
        }

        // Print the results
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
    }
}
