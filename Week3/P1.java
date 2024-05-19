// 1. Write a JAVA program to find the maximum between three numbers.

package Week3;

public class P1 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int maximum;
        if(a > b && a > c){
            maximum = a;
        } else if (b > a && b > c){
            maximum = b;
        } else {
            maximum = c;
        }
        System.out.println("Maximum number among " + a + ", " + b + ", and " + c + " is: " + maximum);
  
    }   
}

// If you want to take numbers from the user
/* 
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maximum;
        if (a > b && a > c) {
            maximum = a;
        } else if (b > a && b > c) {
            maximum = b;
        } else {
            maximum = c;
        }

        // Print the maximum number
        System.out.println("Maximum number between three numbers is: " + maximum);

        // Close the scanner
        scanner.close();
    }
}
*/