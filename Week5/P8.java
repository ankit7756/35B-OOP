// 8. Calculate the nth Fibonacci number using the method.

package Week5;

import java.util.Scanner;

public class P8 {
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n to calculate the nth Fibonacci number: ");
        int n = scanner.nextInt();

        int fibonacciNumber = calculateFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);

        scanner.close();
    }
}

// Easier code for smaller values 

// public class P8 {
//     public static int calculateFibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
//     }

//     public static void main(String[] args) {
//         int n = 10; // Change this value to calculate the nth Fibonacci number
//         int fibonacciNumber = calculateFibonacci(n);
//         System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
//     }
// }
