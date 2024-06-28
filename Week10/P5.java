// 5. You are building a shape hierarchy for a drawing application. 
// Design an abstract class named "Draw" with the following abstract methods:
// calculateVolume(): This method should calculate and return the area of the shape
// calculateArea(): This method should calculate and return the area of the shape.
// calculatePerimeter(): This method should calculate and return the perimeter of the shape.
// Implement the abstract class and provide concrete implementations for the abstract methods. 
// Create subclasses for different shapes such as "Cube," "Cuboid," and "Cylinder." 
// Each subclass should provide specific implementations for calculating the volume, area and perimeter of that shape. 
// Create instances of each shape class and demonstrate how you can calculate their respective volume, areas and perimeters.

package Week10;

public class P5 {
    public static void main(String[] args) {
        Cube cube = new Cube(3);
        Cuboid cuboid = new Cuboid(4, 5, 6);
        Cylinder cylinder = new Cylinder(7, 10);

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Area: " + cube.calculateArea());
        System.out.println("Cube Perimeter: " + cube.calculatePerimeter());

        System.out.println();

        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        System.out.println("Cuboid Area: " + cuboid.calculateArea());
        System.out.println("Cuboid Perimeter: " + cuboid.calculatePerimeter());

        System.out.println();

        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
        System.out.println("Cylinder Area: " + cylinder.calculateArea());
        System.out.println("Cylinder Perimeter: " + cylinder.calculatePerimeter());
    }
}

abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return length * width * height;
    }

    @Override
    double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius + 2 * height;
    }
}

