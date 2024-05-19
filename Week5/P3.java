// 3. Make a method to print the table of a given number n.

package Week5;

import java.util.Scanner;

public class P3 {
    // Method to print the table of a given number
    public static void printTable(int number) {
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + (result));
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Call the printTable method to print the table of the entered number
        printTable(num);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}

