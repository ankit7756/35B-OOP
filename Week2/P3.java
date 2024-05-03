// 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

// Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;

package Week2;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the dimensions of the triangle
        System.out.println("Enter the dimensions of the triangle:");
        System.out.print("Base: ");
        double base = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        
        // Calculate the area of the triangle
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea);
        
        // Prompt the user to enter the dimensions of the cube
        System.out.println("\nEnter the side length of the cube:");
        double cubeSide = scanner.nextDouble();
        
        // Calculate the volume of the cube
        double cubeVolume = Math.pow(cubeSide, 3);
        System.out.println("Volume of the cube: " + cubeVolume);
        
        // Prompt the user to enter the dimensions of the cuboid
        System.out.println("\nEnter the dimensions of the cuboid:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double cuboidHeight = scanner.nextDouble();
        
        // Calculate the volume of the cuboid
        double cuboidVolume = length * width * cuboidHeight;
        System.out.println("Volume of the cuboid: " + cuboidVolume);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
