package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame {

    public static void main(String[] args) {
        Queue<String> playersQueue = new LinkedList<>();

        // Add players to the queue
        playersQueue.add("Amar");
        playersQueue.add("Bobby");
        playersQueue.add("Cherry");
        playersQueue.add("David");
        playersQueue.add("Sam");

        // Set the number of times to pass the potato
        int passes = 3;

        // Simulate the "Hot Potato" game
        while (playersQueue.size() > 1) {
            
        	for (int i = 0; i < passes - 1; i++) {
                
        		// Simulate passing the potato by dequeuing and enqueuing players
                
        		String currentPlayer = playersQueue.poll();
                
        		playersQueue.add(currentPlayer);
            }

            // The player at the front of the queue is out
            System.out.println("Player out: " + playersQueue.poll());
        }

        // Display the winner
        System.out.println("The winner is: " + playersQueue.poll());
    }
}
