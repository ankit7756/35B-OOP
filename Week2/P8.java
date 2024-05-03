// 8. Take side of a square from user and print area and perimeter of it. 
// Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
// Take the attributes as user input.

package Week2;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for square
        System.out.print("Enter the side of the square: ");
        double squareSide = scanner.nextDouble();

        // Input for simple interest
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period in years: ");
        double time = scanner.nextDouble();

        // Input for triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Input for cube
        System.out.print("Enter the side of the cube: ");
        double cubeSide = scanner.nextDouble();

        // Input for cuboid
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();

        // Calculate area and perimeter of the square
        double squareArea = squareSide * squareSide;
        double squarePerimeter = 4 * squareSide;

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate area of the triangle
        double triangleArea = (base * height) / 2;

        // Calculate volume of the cube
        double cubeVolume = cubeSide * cubeSide * cubeSide;

        // Calculate volume of the cuboid
        double cuboidVolume = length * width * heightCuboid;

        // Print results
        System.out.println("Area of the square: " + squareArea);
        System.out.println("Perimeter of the square: " + squarePerimeter);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Area of the triangle: " + triangleArea);
        System.out.println("Volume of the cube: " + cubeVolume);
        System.out.println("Volume of the cuboid: " + cuboidVolume);

        scanner.close();
    }
}

