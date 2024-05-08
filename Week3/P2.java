// 2. Write a JAVA program to check whether a number is negative, positive, or zero.

package Week3;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt(); 
        if (number < 0) {
            System.out.println(number + " is negative.");
        } else if (number > 0) {
            System.out.println(number + " is positive.");
        } else {
            System.out.println(number + " is zero.");
        }
        scanner.close();
    }
}
/* 
Program without using scanner
package Week3;

public class P2 {
    public static void main(String[] args) {
        
        int number = 5; 
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
*/