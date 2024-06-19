/* make a class Rectangle
 * make 2 attributes in double, length and breadth
 * make a function areOfRectangle that returns length * breadth
 * make a function perimeterOfRectangle that returns 2(length+breadth)
 * make an Object of rectangle and print area and perimeter 
 */

package Week7;

public class Task1 {
    // Attributes
    private double length;
    private double breadth;

    // Constructor to initialize the attributes
    public Task1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double areaOfRectangle() {
        return length * breadth;
    }

    // Method to calculate the perimeter of the rectangle
    public double perimeterOfRectangle() {
        return 2 * (length + breadth);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Task1 rectangle = new Task1(5.0, 3.0);

        // Calculate and print the area of the rectangle
        double area = rectangle.areaOfRectangle();
        System.out.println("Area of Rectangle: " + area);

        // Calculate and print the perimeter of the rectangle
        double perimeter = rectangle.perimeterOfRectangle();
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
