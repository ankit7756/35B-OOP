// 5. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'.
// Derive two classes 'Rectangle' and 'Circle' from 'Shape'.
// Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'.
// Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.

package Week9;

public class P5 {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1(20.0,10.0);
        rec.calculateArea();
        rec.calculatePerimeter();

        Circle1 cir = new Circle1(14);
        cir.calculateCircumference();

    }
    
}

class Shape1{
    double length;
    double breadth;
    double radius;

    public Shape1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor for circle
    public Shape1(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        double area = length * breadth;
        System.out.println("The area of rectangle is: " + area);
    }
}

class Rectangle1 extends Shape1{
    public Rectangle1(double length, double bredth){
        super(length, bredth);
    }
    public void calculatePerimeter(){
        double perimeter = 2*(length + breadth);
        System.out.println("The perimeter of rectangle is: " + perimeter);

    }
}

class Circle1 extends Shape1{
    public Circle1(double radius){
        super(radius);
    }
    public void calculateCircumference(){
        double circumference = 2*(Math.PI)*(radius);
        System.out.println("the circumference of circle is: " + circumference);
    }
}