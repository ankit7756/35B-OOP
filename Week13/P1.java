// 1. As a software developer, you have been assigned a task to implement a stack data structure in Java. 
// Your goal is to create a Java class named Stack.java that represents a stack using a array. Implement the following operations:

// push(int element): Adds an integer value element to the top of the stack.

// pop(): Removes and returns the element at the top of the stack.

// peek(): Returns the element at the top of the stack without removing it.

// isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.

// size(): Returns the number of elements currently in the stack.

// Your task is to write the Stack.java class and provide the necessary implementation for these operations using a array as the underlying data structure. 
// Ensure that the stack follows the last-in, first-out (LIFO) principle.

package Week13;

public class P1 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Current stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());

        System.out.println("Current stack size: " + stack.size());

        stack.push(40);
        stack.push(50);
        stack.push(60); // This will show stack overflow

        System.out.println("Final stack size: " + stack.size());
    }
}

class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Adds an integer value element to the top of the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot add element: " + element);
        } else {
            stackArray[++top] = element;
        }
    }

    // Removes and returns the element at the top of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot remove element.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Returns the element at the top of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Checks if the stack is empty and returns a boolean value indicating the result
    public boolean isEmpty() {
        return top == -1;
    }

    // Returns the number of elements currently in the stack
    public int size() {
        return top + 1;
    }

    // Checks if the stack is full
    private boolean isFull() {
        return top == maxSize - 1;
    }
}
