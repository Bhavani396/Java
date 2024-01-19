package com.Queue;


import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingLinkedList {
public static void main(String[] args) {
Queue<String> queue = new LinkedList<>();
// Adding elements to the queue
queue.add("Apple");
queue.add("Banana");
queue.add("Cherry");
// Removing elements from the queue (FIFO order)
String first = queue.poll(); // Removes and returns "Apple"
String second = queue.poll(); // Removes and returns "Banana"
System.out.println(first); // Output: Apple
System.out.println(second); // Output: Banana
}
}
