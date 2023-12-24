package com.Threads;

class AverageThread extends Thread {
    @Override
    
    public void run() {
        
        double average = calculateAverage();
        System.out.println("Average: " + average);
    }

    private double calculateAverage() {
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum / 10;
    }
}

class SquareThread extends Thread {
    private int[] arr = {1, 20, 50, 15, 30};

    @Override
    public  void run() {
        System.out.print("Squares: ");
        for (int num : arr) {
            System.out.print(num * num + " ");
        }
        System.out.println();
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        AverageThread averageThread = new AverageThread();
        SquareThread squareThread = new SquareThread();

        averageThread.start();
        squareThread.start();
    }
}
