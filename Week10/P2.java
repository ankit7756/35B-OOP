// 2. Create an abstract class called Shape with an abstract method called calculateArea(). 
// Implement two subclasses called Rectangle and Circle that inherit from Shape. 
// Override the calculateArea() method in both subclasses to calculate and 
// return the area of a rectangle and a circle, respectively. 
// Write the Java code to implement this scenario with Scanner Input.

package Week10;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle dimensions
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        // Creating Rectangle object and calculating area
        Rectangle rectangle = new Rectangle(length, width);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Input for Circle radius
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        // Creating Circle object and calculating area
        Circle circle = new Circle(radius);
        double circleArea = circle.calculateArea();
        System.out.println("Area of Circle: " + circleArea);

        scanner.close();   
    }
}

abstract class Shape {
    // Abstract method (does not have a body)
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Providing implementation for the abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Providing implementation for the abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
