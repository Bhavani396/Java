package com.Threads;

class NumberGenerator {
    private int number = 1;

    public synchronized void generateNumber() {
        System.out.println(Thread.currentThread().getName() + ": Generated number is " + number++);
        notify(); // Notify waiting thread
        try {
            wait(); // Wait for notification from the other thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class GenerateOddThread extends Thread {
    private NumberGenerator numberGenerator;

    public GenerateOddThread(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            numberGenerator.generateNumber();
        }
    }
}

class GenerateEvenThread extends Thread {
    private NumberGenerator numberGenerator;

    public GenerateEvenThread(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            numberGenerator.generateNumber();
        }
    }
}

public class SynchronizedThreadEx {
	
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();

        GenerateOddThread generateOddThread = new GenerateOddThread(numberGenerator);
        GenerateEvenThread generateEvenThread = new GenerateEvenThread(numberGenerator);

        generateOddThread.start();
        generateEvenThread.start();

        try {
            generateOddThread.join();
            generateEvenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}