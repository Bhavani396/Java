package com.Stack;

//Class to define a node in the link list
class Node {
int data;
Node next; // Each node keeps the reference of the next Node
public Node(int data) {
this.data = data;
this.next = null;
}
}
class StackUsingLinkedList {
int size=0;
private Node top; // Top of the stack
//Constructor to initialize an empty stack
public StackUsingLinkedList() {
top = null;
}
//Method to push an element onto the stack
public void push(int value) {
Node newNode = new Node(value);
if (isEmpty()) {
top = newNode;
} else {
newNode.next = top;
top = newNode;
}
size++;
}
//Method to pop an element from the stack
public int pop() {
if (isEmpty()) {
System.out.println("Stack is empty. Cannot pop.");
return -1; // Return a special value to indicate an empty stack
} else {
int data = top.data;
top = top.next;
size--;
return data;
}
}
//Method to check if the stack is empty
public boolean isEmpty() {
return top == null;
}
//Method to peek at the top element without removing it
public int peek() {
if (isEmpty()) {
System.out.println("Stack is empty. Cannot peek.");
return -1;
} else {
return top.data;
}
}
int size() {
return size;
}
}
public class StackExampleUsingLinkedList {
public static void main(String[] args) {
StackUsingLinkedList stack = new StackUsingLinkedList(); // Create an empty stack
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
System.out.println("Size of the stack: " + stack.size());
System.out.println("Is Stack empty? : " + stack.isEmpty());
System.out.println("Top element: " + stack.peek());
while (!stack.isEmpty()) {
System.out.println("Popped: " + stack.pop());
}
System.out.println("Stack is empty after popping all elements: " + stack.isEmpty());
}
}
