// 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

package Week2;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for length and breadth
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area
        double area = length * breadth;

        // Type cast area to int
        int areaInt = (int) area;

        // Print the area
        System.out.println("Area of the rectangle (type casted to int): " + areaInt);

        scanner.close();
    }
}
