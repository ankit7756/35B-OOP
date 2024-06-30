// 6. You are designing a calculator application. Create a class called "Calculator" with the following overloaded methods:
// a) int add(int a, int b) - This method should add two integers and return the result.
// b) double add(double a, double b) - This method should add two doubles and return the result.
// c) int add(int a, int b, int c) - This method should add three integers and return the result.

package Week11;

public class P6 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int sum1 = cal.add(6,9);
        double sum2 = cal.add(6.9,9.6);
        int sum3 = cal.add(6,9,6);

        System.out.println("The sum of 6 and 9 (integers): " + sum1);
        System.out.println("The sum of 6.9 and 9.6 (doubles): " + sum2);
        System.out.println("The sum of 6 and 9 and 6 (integers): " + sum3);
    } 
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;

    }
}