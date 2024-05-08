/* Task
 * Loop from 1 - 20
 * print the number only if even
 * use continue to complete
 */

package Week4;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.println(i);
        }
    }
}
