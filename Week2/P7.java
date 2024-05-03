// 7. Take the name, roll number, and field of interest from the user and print in the format below:
//  Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.

package Week2;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Prompt the user to enter their roll number
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();
        
        // Prompt the user to enter their field of interest
        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();
        
        // Print the user details in the specified format
        System.out.print("Hey, my name is " + name + " and my roll number is " + rollNumber + "." );
        System.out.print(" My field of interest are " + fieldOfInterest + ".");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
