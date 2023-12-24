package com.Threads;

class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get the current counter value
    public synchronized int getCount() {
        return count;
    }
}

class IncrementerThread extends Thread {
    private Counter counter;

    public IncrementerThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter
        IncrementerThread thread1 = new IncrementerThread(counter);
        IncrementerThread thread2 = new IncrementerThread(counter);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final counter value
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}