/* Make the following array
 * [
 * [10, -10],
 * [20, -20],
 * [-30, 0],
 * [40, 45],
 * [50, 56]
 * ]
 * print the value 50, 56
 */

package Week6;

public class Task4 {
    public static void main(String[] args) {
        // Create the 2D array
        int[][] array = {
            {10, -10},
            {20, -20},
            {-30, 0},
            {40, 45},
            {50, 56}
        };

        // Print the values 50 and 56
        System.out.println("Value 50: " + array[4][0]);
        System.out.println("Value 56: " + array[4][1]);
    }
}

/* Another way for the same problem  */

// public class Task4 {
//     public static void main(String[] args) {
//         // Create the 2D array with explicit memory allocation
//         int[][] array = new int[5][2];

//         // Manually assign values to each element in the array
//         array[0][0] = 10;
//         array[0][1] = -10;

//         array[1][0] = 20;
//         array[1][1] = -20;

//         array[2][0] = -30;
//         array[2][1] = 0;

//         array[3][0] = 40;
//         array[3][1] = 45;

//         array[4][0] = 50;
//         array[4][1] = 56;

//         // Print the values 50 and 56
//         System.out.println("Value 50: " + array[4][0]);
//         System.out.println("Value 56: " + array[4][1]);
//     }
// }
