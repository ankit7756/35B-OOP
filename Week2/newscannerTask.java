/* Task
 * Make a new scanner object/ variable scan1
 * Prompt the following
 * What is your name? -> save as string, name
 * Are you ever 18? -> save as int, sibling
 * Print the following
 * Hello, name
 * Over 18? status
 * you have sibling num of sibling
 * //comment the previous scanner for ease of use 
 */

package Week2;

import java.util.Scanner;

public class newscannerTask {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scan1 = new Scanner(System.in);
        
        // Prompt the user for their name
        System.out.print("What is your name? ");
        String name = scan1.nextLine(); // Read the name as a string
        
        // Prompt the user for their age
        System.out.print("Are you over 18? True for yes and false for no ");
        boolean status = scan1.nextBoolean();
        // Prompt the user for the number of siblings
        System.out.print("How many siblings do you have? ");
        int siblings = scan1.nextInt(); // Read the number of siblings as an integer
        
        // Print the greeting message
        System.out.println("Hello, " + name);
        
        // Print the age status
        System.out.println("Over 18? " + status);
        
        // Print the number of siblings
        System.out.println("You have " + siblings + " sibling(s).");
        
        // Close the scanner object to prevent resource leak
        scan1.close();
    }
}

