/* Task
 * Make a multiplication table of 2
 * For eg:
 * 2 x 1 = 2
 * 2 x 2 = 4
 * ..
 * 2 x 10 = 20
 * Note: Loop from 1 to 10 and multiply  the index
 */

package Week4;

public class Task1 {
    public static void main(String[] args) {
        for(int index = 1; index <= 10; index++){
            System.out.println("2 x " + index + "=" + index * 2);
        }
    }   
}
