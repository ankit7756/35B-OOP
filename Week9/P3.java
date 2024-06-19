// 3. Imagine you are building a geometry calculator program. 
// You need to implement the calculation of areas for different shapes, including rectangles, squares, and circles.
// To achieve this, you decide to use a multilevel inheritance hierarchy.

package Week9;

public class P3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.calculateArea();

        Square square = new Square(4);
        square.calculateArea();

        Circle circle = new Circle(7);
        circle.calculateArea();
    }
}

class Shape {
    int length;
    int breadth;
    int radius;

    // Constructor for rectangle/square
    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor for circle
    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side); // A square is a special case of a rectangle where length == breadth
    }
    

    // No need to override calculateArea method as it is inherited from Rectangle
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

