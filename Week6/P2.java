// 2. Write a Java program to test if an array contains a specific value.

package Week6;

public class P2 {
    public static void main(String[] args) {
        // Define an array with some elements
        int[] numbers = {5, 8, 12, 3, 9, 15};

        // Define the value to search for
        int valueToFind = 12;

        // Initialize the variable to track if the value is found
        boolean found = false;

        // Loop through the array to check if the value exists
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == valueToFind) {
                found = true; // Set found to true if the value is found
                break; // Exit the loop as we have found the value
            }
        }

        // Print the result
        if (found) {
            System.out.println("The array contains the value " + valueToFind);
        } else {
            System.out.println("The array does not contain the value " + valueToFind);
        }
    }
}

// Same program by using scanner

// import java.util.Scanner;

// public class P2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Ask the user for the number of elements
//         System.out.print("Enter the number of elements in the array: ");
//         int n = scanner.nextInt();

//         // Create an array to hold the elements
//         int[] numbers = new int[n];

//         // Get the array elements from the user
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print("Element " + (i + 1) + ": ");
//             numbers[i] = scanner.nextInt();
//         }

//         // Ask the user for the value to search for
//         System.out.print("Enter the value to search for: ");
//         int valueToFind = scanner.nextInt();

//         // Variable to track if the value is found
//         boolean found = false;

//         // Loop through the array to check if the value exists
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == valueToFind) {
//                 found = true;
//                 break;
//             }
//         }

//         // Print the result
//         if (found) {
//             System.out.println("The array contains the value " + valueToFind);
//         } else {
//             System.out.println("The array does not contain the value " + valueToFind);
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }
