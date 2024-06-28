// 4. You are building a shape hierarchy for a drawing application.
// Design an abstract class named "Shape" with the following abstract methods:
// calculateArea(): This method should calculate and return the area of the shape.
// calculatePerimeter(): This method should calculate and return the perimeter of the shape.
// Implement the abstract class and provide concrete implementations for the abstract methods. 
// Create subclasses for different shapes such as "Circle," "Rectangle," and "Triangle." 
// Each subclass should provide specific implementations for calculating the area and perimeter of that shape. 
// Create instances of each shape class and demonstrate how you can calculate their respective areas and perimeters.

package Week10;

public class P4 {
    public static void main(String[] args) {
        Circle c1 = new Circle(8.0);
        Rectangle r1 = new Rectangle(22.0, 10.0);
        Triangle t1 = new Triangle(10, 20, 30);

        // Circle calculations
        double circleArea = c1.calculateArea();
        System.out.println("The area of the circle is: " + circleArea);
        double circlePerimeter = c1.calculatePerimeter();
        System.out.println("The perimeter of the circle is: " + circlePerimeter);
        System.out.println();

        // Rectangle calculations
        double rectangleArea = r1.calculateArea();
        System.out.println("The area of the Rectangle is: " + rectangleArea);
        double rectanglePerimeter = r1.calculatePerimeter();
        System.out.println("The perimeter of the Rectangle is: " + rectanglePerimeter);
        System.out.println();

        // Triangle calculations
        double triangleArea = t1.calculateArea();
        System.out.println("The area of the Triangle is: " + triangleArea);
        double trianglePerimeter = t1.calculatePerimeter();
        System.out.println("The perimeter of the Triangle is: " + trianglePerimeter);
    }
}

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double side;

    public Triangle(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter() {
        return base + height + side;
    }
}

    