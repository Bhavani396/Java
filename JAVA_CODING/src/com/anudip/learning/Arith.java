package com.anudip.learning;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int num1, num2;
		
		 System.out.println("Enter 2 integer values");
		 
		 num1=obj.nextInt();
		 num2=obj.nextInt();
		 
		 System.out.println("Addition"+ (num1+num2));
		 
		 System.out.println("Product"+ (num1*num2));
	
	}

}
