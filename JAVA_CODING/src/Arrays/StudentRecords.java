package Arrays;

import java.util.Scanner;


public class StudentRecords {
	
	
	
	    public static void main(String[] args) {
	       
	    	Scanner obj = new Scanner(System.in);

	        
	    	int numberOfStudents = 5;
	        
	    	int[] rollNo = new int[numberOfStudents];
	       
	    	String[] name = new String[numberOfStudents];

double[] averageMarks = new double[numberOfStudents];

	        // Input student records
	        for (int i = 0; i < numberOfStudents; i++) {
	          
	        	System.out.print("Enter Roll Number for student " + (i + 1) + ": ");
	            
	        	rollNo[i] = obj.nextInt();
	            
	        	obj.nextLine(); // Consume the newline character
	           
	        	System.out.print("Enter Name: ");
	            
	            name[i] = obj.nextLine();
	            
	            System.out.print("Enter Average Marks: ");
	            
	            averageMarks[i] = obj.nextDouble();
	        }

	        System.out.println("\nStudent Records:");

	        // Display student records and list those with average marks above 60
	        
	        for (int i = 0; i < numberOfStudents; i++) {
	            
	        	System.out.println("Roll Number: " + rollNo[i]);
	           
	        	System.out.println("Name: " + name[i]);
	           
	        	System.out.println("Average Marks: " + averageMarks[i]);
	            
	        	System.out.println();

	            if (averageMarks[i] > 60) {
	               
	            	System.out.println(name[i] + " scored above 60 as average marks.");
	            }
	        }
	    
	    }
	    
}


