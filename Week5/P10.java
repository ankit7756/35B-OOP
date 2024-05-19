// 10. Write a Java program to display all prime numbers less than a given number 
// and count all the prime numbers less than that number using functions.  

// Your program should contain two functions: 
// a.  print_prime_less_than that takes a number as a parameter and prints the prime number less than that number 
// b. is_prime that takes a number as a parameter and then returns whether that number is prime.



package Week5;

public class P10 {

    public static void main(String[] args) {
        // Define the number to check primes less than it
        int number = 50;
        
        // Call the function to print prime numbers less than the given number
        print_prime_less_than(number);
    }

    // Function to print prime numbers less than the given number
    public static void print_prime_less_than(int num) {
        int count = 0;
        
        // Loop through all numbers less than num
        for (int i = 2; i < num; i++) {
            // Check if the number is prime
            if (is_prime(i)) {
                // Print the prime number
                System.out.println(i);
                // Increment the count of prime numbers
                count++;
            }
        }
        
        // Print the count of prime numbers
        System.out.println("Total prime numbers less than " + num + ": " + count);
    }

    // Function to check if a number is prime
    public static boolean is_prime(int n) {
        // 0 and 1 are not prime numbers
        if (n <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        // If no divisors found, the number is prime
        return true;
    }
}
