package controlstatements;

public class PerfectNumbers {
	
	 public static void main(String[] args) {
	       
		 System.out.println("Perfect numbers from 1 to 100:");
	        
		 for (int i = 1; i <= 100; i++) {
	            
			 if (isPerfectNumber(i)) {
	                
				 System.out.println(i);
	            }
	        }
	    }

	    public static boolean isPerfectNumber(int number) {
	       
	    	int sumOfDivisors = 0;
	        
	    	for (int divisor = 1; divisor < number; divisor++) {
	            
	    		if (number % divisor == 0) {
	               
	    			sumOfDivisors += divisor;
	            }
	        }
	       
	    	return sumOfDivisors == number;
	   

}

}