package com.Queue;

import java.util.Queue;
import java.util.LinkedList;
public class EnqueueExample {
public static void main(String[] args) {
Queue<String> queue = new LinkedList<>();
// Enqueue (add) elements to the queue
queue.offer("First");
queue.offer("Second");
queue.offer("Third");
// The elements are now in the queue in the order they were added.
// "First" was added first, so it will be at the front.
// To demonstrate, let's peek at the front element.
String frontElement = queue.peek();
System.out.println("Front element: " + frontElement); // Output: Front element: First
}
}