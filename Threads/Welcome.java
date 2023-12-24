package com.Threads;

class WelcomeThread extends Thread {
    private String[] userNames;

    public WelcomeThread(String[] userNames) {
        this.userNames = userNames;
    }

    
    public void run() {
        displayWelcomeMessages();
    }

    private void displayWelcomeMessages() {
        
    	for (String userName : userNames) {
            
    		System.out.println("Welcome, " + userName + "!");
            try {
                
            	Thread.sleep(100); // Simulate some work
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Welcome {
    
	public static void main(String[] args) {
        
		String[] userNames = {"Sam", "Kiran", "Hari", "Ram", "Amar"};

        // Create two threads
        WelcomeThread thread1 = new WelcomeThread(userNames);
        WelcomeThread thread2 = new WelcomeThread(userNames);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}