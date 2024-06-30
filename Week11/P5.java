// 5. You are building a shape manipulation application. 
// There are different types of shapes, such as circles, squares, and triangles. 
// Each shape has its own resizing and rotation methods. 
// Implement a Java program using polymorphism to manipulate and transform different shapes.

package Week11;

public class P5 {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape1 circle = new Circle1(5.0);
        Shape1 square = new Square1(8.0);
        Shape1 triangle = new Triangle1(10.0, 6.0);

        // Perform operations using polymorphism
        manipulateShape(circle);
        manipulateShape(square);
        manipulateShape(triangle);
    }

    // Method to manipulate a shape
    public static void manipulateShape(Shape1 shape) {
        shape.resize(1.5); // Resize by factor 1.5
        shape.rotate(30);  // Rotate by 30 degrees
        System.out.println();
    }
}

abstract class Shape1 {
    abstract void resize(double factor);
    abstract void rotate(double angle);
}

class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    void resize(double factor) {
        radius *= factor;
        System.out.println("Resized circle: new radius = " + radius);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotated circle by " + angle + " degrees");
    }
}

class Square1 extends Shape1 {
    private double sideLength;

    public Square1(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    void resize(double factor) {
        sideLength *= factor;
        System.out.println("Resized square: new side length = " + sideLength);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotated square by " + angle + " degrees");
    }
}

class Triangle1 extends Shape1 {
    private double base;
    private double height;

    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void resize(double factor) {
        base *= factor;
        height *= factor;
        System.out.println("Resized triangle: new base = " + base + ", new height = " + height);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotated triangle by " + angle + " degrees");
    }
}

