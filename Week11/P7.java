// 7. You are building a geometry application. Create a class called "Geometry" with the following overloaded methods:
// a) double calculateArea(double radius) - This method should calculate and return the area of a circle with the given radius.
// b) double calculateArea(double length, double width) - This method should calculate and return the area of a rectangle with the given length and width.
// c) double calculateArea(double base, double height, boolean type) - This method should calculate and return the area of a triangle with the given base and height.

package Week11;

public class P7 {
    public static void main(String[] args) {
        Geometry geo = new Geometry();
        System.out.println("The area of the circle is: " + geo.calculateArea(7.5));
        System.out.println("The area of the rectangle is: " + geo.calculateArea(6,7));
        System.out.println("The area of the triangle is: " + geo.calculateArea(7,8,true));
    }  
}

class Geometry {
    public double calculateArea (double radius){
        return Math.PI * (radius * radius);
    }

    public double calculateArea(double length, double width){
        return length * width;
    }

    public double calculateArea(double base, double height, boolean type) {
        if (type) {
            return Math.sqrt(3) / 4 * base * base; //(If true then calculate area for an equilateral triangle )
        } else {
            return 0.5 * base * height; //(If false then calculate area for an isosceles triangle)
        }
    }
}