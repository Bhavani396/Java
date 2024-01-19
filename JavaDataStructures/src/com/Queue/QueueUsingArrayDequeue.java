package com.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
public class QueueUsingArrayDequeue {
public static void main(String[] args) {
Queue<String> queue = new ArrayDeque<>();
queue.offer("Apple"); // Adds an element to the queue
queue.offer("Banana");
queue.offer("Cherry");
String first = queue.poll(); // Removes and returns "Apple"
String second = queue.poll(); // Removes and returns "Banana"
System.out.println(first); // Output: Apple
System.out.println(second); // Output: Banana
}
}
