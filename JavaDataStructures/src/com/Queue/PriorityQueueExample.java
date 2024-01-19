package com.Queue;

import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {
public static void main(String[] args) {
Queue<Integer> priorityQueue = new PriorityQueue<>();
priorityQueue.offer(5);
priorityQueue.offer(1);
priorityQueue.offer(3);
Integer highestPriority = priorityQueue.poll(); // Removes and returns 1
System.out.println(highestPriority); // Output: 1
}
}