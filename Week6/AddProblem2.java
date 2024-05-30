// Develop a simple menu-driven student grading system program in Java that operates on an array of student grades.
// The program will display a Menu with those options and prompt the user to choose his/her option.

// The program should provide the functionalities:

// 1.    Add a grade to the system
// 2.    Display all grades
// 3.    Calculate the average grade
// 4.    Find the highest grade
// 5.    Find the lowest grade
// 6.    Exit the program

// Note: Based on the user's selection, the program will perform the corresponding operation and display the result or carry out the desired action.
// The program will continue to show the menu until the user chooses the option to exit.


package Week6;

import java.util.Scanner;

public class AddProblem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] grades = new int[100]; // Assuming the maximum number of grades is 100
        int size = 0; // Current number of grades in the system

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a grade to the system");
            System.out.println("2. Display all grades");
            System.out.println("3. Calculate the average grade");
            System.out.println("4. Find the highest grade");
            System.out.println("5. Find the lowest grade");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (size < grades.length) {
                        System.out.print("Enter the grade to add: ");
                        int grade = scanner.nextInt();
                        grades[size++] = grade;
                        System.out.println("Grade added successfully.");
                    } else {
                        System.out.println("Grade system is full. Cannot add more grades.");
                    }
                    break;
                case 2:
                    if (size == 0) {
                        System.out.println("Grade system is empty.");
                    } else {
                        System.out.println("All grades:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(grades[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (size == 0) {
                        System.out.println("Grade system is empty. Cannot calculate average.");
                    } else {
                        double sum = 0;
                        for (int i = 0; i < size; i++) {
                            sum += grades[i];
                        }
                        double average = sum / size;
                        System.out.println("Average grade: " + average);
                    }
                    break;
                case 4:
                    if (size == 0) {
                        System.out.println("Grade system is empty. Cannot find highest grade.");
                    } else {
                        int highest = grades[0];
                        for (int i = 1; i < size; i++) {
                            if (grades[i] > highest) {
                                highest = grades[i];
                            }
                        }
                        System.out.println("Highest grade: " + highest);
                    }
                    break;
                case 5:
                    if (size == 0) {
                        System.out.println("Grade system is empty. Cannot find lowest grade.");
                    } else {
                        int lowest = grades[0];
                        for (int i = 1; i < size; i++) {
                            if (grades[i] < lowest) {
                                lowest = grades[i];
                            }
                        }
                        System.out.println("Lowest grade: " + lowest);
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
