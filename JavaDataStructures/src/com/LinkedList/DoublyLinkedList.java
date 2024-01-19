package com.LinkedList;

class Node {
int data;
Node prev;
Node next;
Node(int data) {
this.data = data;
this.prev = null;
this.next = null;
}
}
public class DoublyLinkedList {
private Node head;
private Node tail;
public DoublyLinkedList() {
this.head = null;
this.tail = null;
}
// Check if the list is empty
public boolean isEmpty() {
return head == null;
}
// Add a node to the end of the list
public void append(int data) {
Node newNode = new Node(data);
if (isEmpty()) {
head = newNode;
tail = newNode;
} else {
newNode.prev = tail;
tail.next = newNode;
tail = newNode;
}
}
// Add a node to the beginning of the list
public void prepend(int data) {
Node newNode = new Node(data);
if (isEmpty()) {
head = newNode;
tail = newNode;
} else {
newNode.next = head;
head.prev = newNode;
head = newNode;
}
}
// Print the elements of the list from the head to tail
public void printForward() {
Node current = head;
while (current != null) {
System.out.print(current.data + " -> ");
current = current.next;
}
System.out.println("null");
}
// Print the elements of the list from the tail to head
public void printBackward() {
Node current = tail;
while (current != null) {
System.out.print(current.data + " -> ");
current = current.prev;
}
System.out.println("null");
}
public static void main(String[] args) {
DoublyLinkedList dll = new DoublyLinkedList();
// Append some elements to the list
dll.append(1);
dll.append(2);
dll.append(3);
// Prepend an element to the list
dll.prepend(0);
// Print the list in both forward and backward directions
System.out.println("Doubly Linked List (Forward):");
dll.printForward();
System.out.println("Doubly Linked List (Backward):");
dll.printBackward();

}
}