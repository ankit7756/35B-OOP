// Write a Java program to create a class called "Circle" with a radius attribute.
// You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.

package Week7;

public class P1 {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle();

        // Set the radius using the setter method
        circle.setRadius(5.0);

        // Get the radius using the getter method and print it
        System.out.println("Radius: " + circle.getRadius());

        // Calculate and print the area of the circle
        double area = circle.calculateArea();
        System.out.println("Area: " + area);

        // Calculate and print the circumference of the circle
        double circumference = circle.calculateCircumference();
        System.out.println("Circumference: " + circumference);
    }
}

class Circle {
    // Private attribute
    private double radius;

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

