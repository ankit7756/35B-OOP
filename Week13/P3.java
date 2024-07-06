// 3. Design a program that simulates a supermarket queue management system using an array-based implementation of a queue. 
// The system should allow customers to join the queue, get served, and exit the queue. 
// Implement the following functionalities:

// a. Add a customer to the queue.

// b. Serve the next customer in the queue.

// c. Display the current queue.

// d. Display the number of customers in the queue.

// e. Exit the program

package Week13;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Supermarket Queue Management System!");

        // Initialize the queue with a maximum size
        final int MAX_QUEUE_SIZE = 10; // Assuming a maximum of 10 customers in the queue
        int[] queue = new int[MAX_QUEUE_SIZE];
        int front = -1, rear = -1;

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a customer to the queue");
            System.out.println("2. Serve the next customer");
            System.out.println("3. Display the current queue");
            System.out.println("4. Display the number of customers in the queue");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a customer to the queue
                    if (rear == MAX_QUEUE_SIZE - 1) {
                        System.out.println("Queue is full. Cannot add more customers.");
                    } else {
                        System.out.println("Enter customer ID to add:");
                        int customerID = scanner.nextInt();
                        if (front == -1) {
                            front = 0;
                        }
                        queue[++rear] = customerID;
                        System.out.println("Customer " + customerID + " added to the queue.");
                    }
                    break;
                case 2:
                    // Serve the next customer
                    if (front == -1 || front > rear) {
                        System.out.println("Queue is empty. No customers to serve.");
                    } else {
                        int servedCustomer = queue[front++];
                        System.out.println("Customer " + servedCustomer + " served.");
                        if (front > rear) {
                            front = rear = -1; // Reset queue pointers if queue becomes empty
                        }
                    }
                    break;
                case 3:
                    // Display the current queue
                    if (front == -1 || front > rear) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Current Queue:");
                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    // Display the number of customers in the queue
                    if (front == -1 || front > rear) {
                        System.out.println("Number of customers in the queue: 0");
                    } else {
                        int numCustomers = rear - front + 1;
                        System.out.println("Number of customers in the queue: " + numCustomers);
                    }
                    break;
                case 5:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting Supermarket Queue Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}

