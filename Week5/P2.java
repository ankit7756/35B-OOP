// 2. Make a method to check if a given number n is even or not.

package Week5;

import java.util.Scanner;

public class P2 {
    // Method to check if a number is even
    public static boolean isEven(int number) {
        if (number % 2 == 0){
        return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to be checked: ");
        int num = scan.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
        scan.close();
    }
}

    
// Proram to check if even or odd
// package Practise1;

// public class A2 {
//     // Method to check if a number is even or odd
//     public static String evenOdd(int num) {
//         if (num % 2 == 0) {
//             return "even";
//         } else {
//             return "odd";
//         }
//     }

//     public static void main(String[] args) {
//         int number = 3;
//         String result = evenOdd(number);
//         System.out.println(number + " is " + result);
//     }
// }
