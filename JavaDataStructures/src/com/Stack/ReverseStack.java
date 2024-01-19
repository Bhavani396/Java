package com.Stack;

import java.util.Stack;
public class ReverseStack {
// Function to reverse a stack
public static void reverse(Stack<Integer> stack) {
Stack<Integer> tempStack = new Stack<>();
Stack<Integer> copyStack = new Stack<>();
// Pop elements from the original stack and push onto the temp stack
while (!stack.isEmpty()) {
tempStack.push(stack.pop());
}
// Pop elements from the temp stack and push back onto the copy stack
// This will make an exact copy of the original stak.
while (!tempStack.isEmpty()) {
copyStack.push(tempStack.pop());
}
// Now just get the element from the copied stack and
// insert into the original. This operation will reverse the stack.
while (!copyStack.isEmpty()) {
stack.push(copyStack.pop());
}
}
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
// Push elements onto the original stack
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
System.out.println("Original stack: " + stack);
// Reverse the stack
reverse(stack);
System.out.println("Reversed stack: " + stack);
}
}

