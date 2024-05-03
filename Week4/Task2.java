/* Task
 * Make a multplication table like the following
 * Multiplication table of 10
 * 10 x 1 = 10
 * 10 x 2 = 20
 * ..
 * 10 x 10 = 100
 * ..
 * Multiplication table of 1
 * 1 x 1 = 1
 * 1 x 2 = 2
 * ..
 * 1 x 10 = 10
 * Do it using nested loop
 */

package Week4;

public class Task2 {
    public static void main(String[] args) {
        // Iterate from 10 to 1 to generate the multiplication table for each number in reverse order
        for (int i = 10; i >= 1; i--) {
            System.out.println("Multiplication table of " + i);
            // Iterate from 1 to 10 for each number to print the multiplication table
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Add a blank line after each multiplication table
        }
    }
}



