// 2. You are tasked with implementing a stack data structure in Java without using any built-in libraries. 
// Your goal is to create a CustomStack class that can handle various operations. 
// The class should have the following functionalities:

// push(int val): Adds an integer value val to the top of the stack.

// pop(): Removes and returns the element at the top of the stack.

// peek(): Returns the element at the top of the stack without removing it.

// isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.

// isFull(): Checks if the stack is full and returns a boolean value indicating the result.

package Week13;

public class P2 {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

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

class CustomStack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a given size
    public CustomStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Adds an integer value val to the top of the stack
    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot add element: " + val);
        } else {
            stackArray[++top] = val;
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

    // Checks if the stack is full and returns a boolean value indicating the result
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Returns the number of elements currently in the stack
    public int size() {
        return top + 1;
    }
}

