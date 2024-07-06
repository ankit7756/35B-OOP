// 4. Implement a call center queue using an array-based implementation of a queue. 
// The program should allow call center agents to handle incoming calls in a fair manner. 
// Implement the following functionalities:

// a. Add an incoming call to the queue.

// b. Serve and handle the next call in the queue.

// c. Display the current call queue.

// d. Display the number of pending calls.

// e. Exit the program.

package Week13;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Call Center Queue Management System!");

        // Initialize the queue with a maximum size
        final int MAX_QUEUE_SIZE = 10; // Assuming a maximum of 10 pending calls in the queue
        int[] callQueue = new int[MAX_QUEUE_SIZE];
        int front = -1, rear = -1;

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add an incoming call to the queue");
            System.out.println("2. Serve and handle the next call");
            System.out.println("3. Display the current call queue");
            System.out.println("4. Display the number of pending calls");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add an incoming call to the queue
                    if (rear == MAX_QUEUE_SIZE - 1) {
                        System.out.println("Call queue is full. Cannot add more calls at the moment.");
                    } else {
                        System.out.println("Enter call ID to add:");
                        int callID = scanner.nextInt();
                        if (front == -1) {
                            front = 0;
                        }
                        callQueue[++rear] = callID;
                        System.out.println("Call " + callID + " added to the queue.");
                    }
                    break;
                case 2:
                    // Serve and handle the next call
                    if (front == -1 || front > rear) {
                        System.out.println("No pending calls in the queue.");
                    } else {
                        int handledCall = callQueue[front++];
                        System.out.println("Call " + handledCall + " handled.");
                        if (front > rear) {
                            front = rear = -1; // Reset queue pointers if queue becomes empty
                        }
                    }
                    break;
                case 3:
                    // Display the current call queue
                    if (front == -1 || front > rear) {
                        System.out.println("Call queue is empty.");
                    } else {
                        System.out.println("Current Call Queue:");
                        for (int i = front; i <= rear; i++) {
                            System.out.print(callQueue[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    // Display the number of pending calls
                    if (front == -1 || front > rear) {
                        System.out.println("Number of pending calls: 0");
                    } else {
                        int numCalls = rear - front + 1;
                        System.out.println("Number of pending calls: " + numCalls);
                    }
                    break;
                case 5:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting Call Center Queue Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
