// 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
//  And use the following conditions to generate the final result;

// a. If equal to or more than 70 -> First Class

// b. If more than 59 -> Upper Second Class

// c. If more than 49 -> Second class

// d. If more than 39 -> Third class and if below than 40 the result is fail. 

// Hint: Use ternary operator

package Week2;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for four subjects
        System.out.println("Enter marks for four subjects:");
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();

        // Calculate total marks and percentage
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double percentage = (double) totalMarks / 4;

        // Determine the result based on percentage
        String result = (percentage >= 70) ? "First Class"
                : (percentage > 59) ? "Upper Second Class"
                : (percentage > 49) ? "Second Class"
                : (percentage > 39) ? "Third Class"
                : "Fail";

        // Display total marks, percentage, and result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);

        scanner.close();
    }
}
