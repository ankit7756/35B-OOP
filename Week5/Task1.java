/* create a function checkEligible
 * takes 2 parameter, String name, int age
 * returns String
 * if age less than 0, more than 200 return "Hello name, Invalid age"
 * if age is less than 18 return "Sorry name you are not eligible" 
 * else return "Congratulation name, you are eligible"
 */


package Week5;

// public class Task1 {
//     public static String checkEligible(String name, int age) {
//         if (age < 0 || age > 200) {
//             return "Hello " + name + ", Invalid age";
//         } else if (age < 18) {
//             return "Sorry " + name + ", you are not eligible";
//         } else {
//             return "Congratulations " + name + ", you are eligible";
//         }
//     }
//     public static void main(String[] args) {
//         String result = checkEligible("John", 25);
//         System.out.println(result);
//     }
// }

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Call the checkEligible function with user input
        String result = checkEligible(name, age);
        
        // Print the result
        System.out.println(result);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }

    // Function to check eligibility based on age
    public static String checkEligible(String name, int age) {
        if (age < 0 || age > 200) {
            return "Hello " + name + ", Invalid age";
        } else if (age < 18) {
            return "Sorry " + name + ", you are not eligible";
        } else {
            return "Congratulation " + name + ", you are eligible";
        }
    }
}

