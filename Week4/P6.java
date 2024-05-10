// 6. Write a program that reads the width and generates a corresponding triangle of *.
// For example, if width = 5, output is:

// *
// **
// ***
// ****
// *****
// Use a nested for loop to generate the above pattern.



package Week4;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the triangle: ");
        int width = scanner.nextInt();

        for (int i = 1; i <= width; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop for each column in the current row
                System.out.print("*"); // Print '*'
            }
            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();
    }
}
