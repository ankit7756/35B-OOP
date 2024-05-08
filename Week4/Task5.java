/* loop from -5 to 5
 * break the loop if the value is positive
 */

package Week4;

public class Task5 {
    public static void main(String[] args) {
        for (int i = -5; i <= 5; i++) {
            if (i > 0) {
                break; // Break the loop if value is positive
            }
            System.out.println(i);
        }
    }
}
