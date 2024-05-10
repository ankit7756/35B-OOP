// 10. Write a program that asks the user for a positive nonzero integer value. 
// The program should use a loop to get the sum of all the integers from 1 up to the number entered.
//  For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50.

package Week4;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive nonzero integer: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive nonzero integer.");
        } else {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("The sum of all integers from 1 to " + num + " is: " + sum);
        }

        scanner.close();
    }
}
