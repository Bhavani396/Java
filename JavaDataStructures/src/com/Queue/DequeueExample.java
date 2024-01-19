package com.Queue;

import java.util.Queue;
import java.util.LinkedList;
public class DequeueExample {
public static void main(String[] args) {
Queue<String> queue = new LinkedList<>();
// Enqueue (add) elements to the queue
queue.offer("First");
queue.offer("Second");
queue.offer("Third");
// Dequeue (remove and return) an element from the front of the queue
String frontElement = queue.poll();
// The front element "First" has been removed.
// The queue now contains "Second" and "Third".
System.out.println("Front element removed: " + frontElement); // Output: Front element removed: First
}
}