// 1. Make a method to check if a number is prime or not.

package Week5;

import java.util.Scanner;

public class P1 {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the entered number is prime using the isPrime method
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}

// Another method
// public class P1 {
//     // Method to check if a number is prime
//     public static boolean isPrime(int number) {
//         if (number <= 1) {
//             return false;
//         }
//         int divisorCount = 0;
//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 divisorCount++;
//                 if (divisorCount > 2) {
//                     return false;
//                 }
//             }
//         }
//         return divisorCount == 2;
//     }

//     public static void main(String[] args) {
//         // Test the isPrime method
//         int num = 17;
//         if (isPrime(num)) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//     }
// }
