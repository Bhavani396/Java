package com.LinkedList;

public class CircularLinkedList<T> {
private Node<T> head;
private int size;
// Inner class representing a node in the circular linked list
private static class Node<T> {
T data;
Node<T> next;
Node(T data) {
this.data = data;
this.next = null;
}
}
// Constructor to initialize an empty circular linked list
public CircularLinkedList() {
this.head = null;
this.size = 0;
}
// Check if the circular linked list is empty
public boolean isEmpty() {
return size == 0;
}
// Get the size (number of elements) of the circular linked list
public int size() {
return size;
}
// Add an element to the end of the circular linked list
public void add(T data) {
Node<T> newNode = new Node<>(data);
if (isEmpty()) {
head = newNode;
head.next = head; // Point to itself since it's the only node
} else {
Node<T> current = head;
while (current.next != head) {
current = current.next;
}
current.next = newNode;
newNode.next = head; // Make the new node point to the head to create the loop
}
size++;
}
// Display the elements of the circular linked list
public void display() {
if (isEmpty()) {
System.out.println("Circular Linked List is empty.");
return;
}
Node<T> current = head;
do {
System.out.print(current.data + "(Next data "
+ current.next.data + ")" + "->");
current = current.next;
} while (current != head);
System.out.println("(Head Reached)");
}
public static void main(String[] args) {
CircularLinkedList<Integer> circularList = new CircularLinkedList<>();
circularList.add(1);
circularList.add(2);
circularList.add(3);
circularList.add(4);
System.out.println("Circular Linked List:");
circularList.display();
}
}