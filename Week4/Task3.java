/* Task
* Prompt user to enter a number
* run loop and ask user the integer until the 
* integer is negative
*/

package Week4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
         /* Task
         * Prompt user to enter a number
         * run loop and ask user the integer until the 
         * integer is negative
         */
        Scanner scan = new Scanner (System.in);
        int input;
        do{
            System.out.print("Enter a negative: ");
            input = scan.nextInt();
        
        } while(input > 0);
        System.out.println("Negative number" + input);
        scan.close();
    }
    
}
