package controlstatements;


	
	import java.util.Scanner;
	
	public class AddNumbers {

	
	    public static void main(String[] args) {
	        
	    	Scanner obj = new Scanner(System.in);
	        
	    	char repeat;

	        do {
	            // Input two numbers
	            System.out.print("Enter the first number: ");
	            double num1 = obj.nextDouble();

	            System.out.print("Enter the second number: ");
	            double num2 = obj.nextDouble();

	            // Calculate and display the sum
	            double sum = num1 + num2;
	            System.out.println("Sum: " + sum);

	            // Ask if the user wants to repeat
	            System.out.print("Do you want to perform the operation again? (y/n): ");
	            repeat = obj.next().charAt(0);

	        } 
	        while (repeat == 'y' || repeat == 'Y');

	        System.out.println("Program terminated.");
	        
	    }
	}


