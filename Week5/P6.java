// 6. Write a program to calculate the area of a rectangle using a method of your choice. 
// Formula is Area = Length x Width

package Week5;

import java.util.Scanner;    

public class P6 {
    public static double Area(double length, double width){
        return length*width;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double result = Area(length,width);
        System.out.println("The area of rectangle is: " + result);
        scanner.close();
    }
    
}
