package controlstatements;

import java.util.Scanner;


public class count_oddEven {
	
	
 public static void main(String[] args) {
	 
	        Scanner obj = new Scanner(System.in);
	        int evenCount = 0;
	        int oddCount = 0;

	        System.out.println("Enter numbers. Enter -1 to terminate.");

	        while (true) {
	            System.out.print("Enter a number: ");
	            int num = obj.nextInt();

	            if (num == -1) {
	                break; // Terminate the loop if -1 is entered
	            }

	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("Total even numbers: " + evenCount);
	        System.out.println("Total odd numbers: " + oddCount);

	       
	    }
	}


