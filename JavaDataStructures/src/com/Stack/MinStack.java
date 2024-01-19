package com.Stack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack; // Main stack
    private Stack<Integer> minStack; // Stack to keep track of minimum element

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto the stack
    public void push(int x) {
        stack.push(x);

        // Update minStack with the current minimum element
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop element from the stack
    public void pop() {
        if (!stack.isEmpty()) {
            // Check if the element to be popped is the current minimum
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }

    // Return the top element of the stack
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Return the minimum element in the stack
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Example usage
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        System.out.println("Top element: " + minStack.top()); // Output: 5
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 3

        minStack.push(2);
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 2

        minStack.pop();
        System.out.println("Top element: " + minStack.top()); // Output: 5
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 3
    }
}




