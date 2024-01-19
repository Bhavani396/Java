package com.LinkedList;

public class GenericLinkedList<T> {
	// Contains Node of type T
	private Node<T> head;
	// When we create the LinkedList it
	// creates the Head as null. That means
	// List will be empty.
	public GenericLinkedList() {
	this.head = null;
	}
	/*
	* add () method adds a node. It also checks if the List is empty.
	* Then head of the List points to this added node.
	*/
	public void add(T data) {
	Node<T> newNode = new Node<>(data);
	if (head == null) { // When the list is empty head will be new node with
	// the added data.
	head = newNode;
	}
	else {
	Node<T> current = head;
	while (current.next != null) {
	current = current.next;
	}
	current.next = newNode;
	}
	}
	public void remove(T data) {
	if (head == null) {
	return;
	}
	if (head.data == data) {
	head = head.next;
	return;
	}
	Node<T> current = head;
	Node<T> previous = null;
	// Search for the node in the linked list
	// which has the same data as the parameter data
	while (current != null && current.data != data) {
	previous = current;
	current = current.next;
	}
	if (current != null) {
	previous.next = current.next;
	}
	}
	// Contain method traverse through the
	// Linked List and finds if there is match.
	// Return false if not found.
	public boolean contains(T data) {
	Node<T> current = head;
	while (current != null) {
	if (current.data == data) {
	return true;
	}
	current = current.next;
	}
	return false;
	}
	public boolean isEmpty() {
	return head == null;
	}
	// This Node class contains the data of type <T>
	// and a reference to next node.
	private static class Node<T> {
	private T data;
	private Node<T> next;
	public Node(T data) {
	this.data = data;
	this.next = null;
	}
	}
	// Test our Linked List in the main method
	public static void main(String[] args) {
	GenericLinkedList<String> linkedList = new GenericLinkedList<>();
	linkedList.add("Hello");
	linkedList.add("World!");
	System.out.println(linkedList.contains("Hello")); // true
	System.out.println(linkedList.contains("Goodbye")); // false
	linkedList.remove("Hello");
	System.out.println(linkedList.contains("Hello")); // false
	}
}