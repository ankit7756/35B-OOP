// Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:

// *****
// *****
// *****
// *****
// *****

package Week4;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the square: ");
        int width = scanner.nextInt();

        // Loop to generate each row of the square
        for (int i = 0; i < width; i++) {
            // Loop to print '*' for each column
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();
    }
}
