package com.Exceptionhandling;

public class SquareNum {
	
	private double number;
	
	public SquareNum(double number) throws NonZeroValueException {
        
		if (number == 0) {
          
			throw new NonZeroValueException();
        }
        
		this.number=number;
	}
        public double SquareNum() {
        	
        	return number*number;
    }

    public static void main(String[] args) {
        try {
            
        	double inputNumber = 5;          // Replace with your input value
            
        	SquareNum squareNum = new SquareNum(inputNumber);
        	
        	double result= squareNum.SquareNum();
            
        	System.out.println("The square of " + inputNumber + " is " + result);
        } 
        catch (NonZeroValueException e) {
            
        	System.out.println("Error: " + e.getMessage());
        }
    }
}

//Custom exception class to check for non-zero value

 class NonZeroValueException extends Exception {
    
	 public NonZeroValueException() {
        
		 super("Value must be a non-zero number.");
    }
}