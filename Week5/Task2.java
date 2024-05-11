/* Task 2
 * create a function makeSquare that takes double
 * return double of square value
 */

package Week5;
public class Task2 {
    public static double makeSquare(double number) {
        return number * number;
    }

    public static void main(String[] args) {
        double result = makeSquare(5.5);
        System.out.println("Square of the number: " + result);
    }
}

