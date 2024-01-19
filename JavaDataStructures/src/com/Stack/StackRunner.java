package com.Stack;

class Stack {
private int maxSize; // Maximum size of the stack
private int top; // Index of the top element
private int[] stackArray; // Array to store stack elements
// Constructor to initialize the stack
public Stack(int size) {
maxSize = size;
stackArray = new int[maxSize];
top = -1; // Initialize top to -1 to indicate an empty stack
}
// Method to push an element onto the stack
public void push(int value) {
if (isFull()) {
System.out.println("Stack is full. Cannot push " + value);
}
else {
stackArray[++top] = value; // Increment top and add the element
}
}
// Method to pop an element from the stack
public int pop() {
if (isEmpty()) {
System.out.println("Stack is empty. Cannot pop.");
return -1; // Return a special value to indicate an empty stack
}
else {
return stackArray[top--]; // Return the element and decrement top
}
}
// Method to check if the stack is empty
public boolean isEmpty() {
return (top == -1);
}
// Method to check if the stack is full
public boolean isFull() {
return (top == maxSize - 1);
}
// Method to peek at the top element without removing it
public int peek() {
if (isEmpty()) {
System.out.println("Stack is empty. Cannot peek.");
return -1;
}
else {
return stackArray[top];
}
}
// Method to get the number of elements in the stack
public int size() {
return top + 1;
}
}
public class StackRunner {
public static void main(String[] args) {
Stack stack = new Stack(5); // Create a stack with a maximum size of 5
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
System.out.println("Stack size: " + stack.size());
System.out.println("Top element: " + stack.peek());
while (!stack.isEmpty()) {
System.out.println("Popped: " + stack.pop());
}
System.out.println("Stack size after popping all elements: " + stack.size());
}
}
