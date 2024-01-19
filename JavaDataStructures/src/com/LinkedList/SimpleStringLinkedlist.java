package com.LinkedList;

//ListNode class to store the data as String
class ListNode {
String data; // Stores the data
ListNode next; // Keeps the reference of the next node.
ListNode(String data) {
this.data = data;
this.next = null;
}
}
public class SimpleStringLinkedlist {
private ListNode head;
private int size;
public SimpleStringLinkedlist() {
this.head = null;
this.size = 0;
}
//Add a new node to the end of the list
public void add(String data) {
ListNode newNode = new ListNode(data);
//When the list is empty head will be new node with
//the added data.
if (head == null) {
head = newNode;
}
else { // Otherwise change
ListNode current = head;
//Traverse through all the element
//starting from the head.
while (current.next != null) {
current = current.next;
}
//After exiting the loop current node is the
//last node or tail of the List.
//It was referring to null as there was no next node
current.next = newNode; // We change the next node of previous tail
//node to this new tail node.
}
size++;
}
//Get the size of the list
public int size() {
return size;
}
//Print the elements of the list
public void printList() {
ListNode current = head;
//Traverse through all the nodes from head
while (current != null) {
System.out.print(current.data + " -> ");
current = current.next;
}
System.out.println("null");
}
public static void main(String[] args) {
SimpleStringLinkedlist list = new SimpleStringLinkedlist();
//Add elements to the list
list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.add("Date");
list.add("Mango");
//Print the list
System.out.println("Linked List Elements:");
list.printList();
//Get the size of the list
System.out.println("Size of the list: " + list.size());
}
}

