// Develop a simple menu-driven application in Java that operates on an array of elements.
// The program will display a Menu with those options and prompt the user to choose his/her option.

// The program should provide the functionalities:

// 1.    Add an element to the array
// 2.    Display all the elements of the array
// 3.    Reverse the elements of the array
// 4.    Find the largest element of the array
// 5.    Find the smallest element of the array
// 6.    Exit the program

// Note: Based on the user's selection, the program will perform the corresponding operation and display the result or carry out the desired action. 
// The program will continue to show the menu until the user chooses the option to exit.

package Week6;

import java.util.Scanner;

public class AddProblem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10]; // Assuming the array size is 10
        int size = 0; // Current number of elements in the array

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add an element to the array");
            System.out.println("2. Display all the elements of the array");
            System.out.println("3. Reverse the elements of the array");
            System.out.println("4. Find the largest element of the array");
            System.out.println("5. Find the smallest element of the array");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (size < array.length) {
                        System.out.print("Enter the element to add: ");
                        int element = scanner.nextInt();
                        array[size++] = element;
                        System.out.println("Element added successfully.");
                    } else {
                        System.out.println("Array is full. Cannot add more elements.");
                    }
                    break;
                case 2:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.println("Elements in the array:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.println("Reversed elements of the array:");
                        for (int i = size - 1; i >= 0; i--) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int largest = array[0];
                        for (int i = 1; i < size; i++) {
                            if (array[i] > largest) {
                                largest = array[i];
                            }
                        }
                        System.out.println("Largest element of the array: " + largest);
                    }
                    break;
                case 5:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int smallest = array[0];
                        for (int i = 1; i < size; i++) {
                            if (array[i] < smallest) {
                                smallest = array[i];
                            }
                        }
                        System.out.println("Smallest element of the array: " + smallest);
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
