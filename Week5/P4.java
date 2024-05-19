// Write a program for multiplying 3 numbers using a method 
// and return the result and print the result from the main method.

package Week5;

public class P4 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        
        // Call the method to multiply three numbers
        int result = multiply(num1, num2, num3);
        
        // Print the result
        System.out.println("The result of multiplying " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
    }
    
    // Method to multiply three numbers and return the result
    public static int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}
