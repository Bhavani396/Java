package com.anudip.learning;

import java.util.Scanner;


public class InternetBillCalculator {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter the total data consumed (in GB): ");
	        
	        int totalDataConsumed = input.nextInt();
	        
	        int basicCharge = 300;
	        int billAmount;

	        if (totalDataConsumed < 10) {
	            billAmount = basicCharge;
	        } else if (totalDataConsumed >= 10 && totalDataConsumed <= 30) {
	            billAmount = basicCharge + 5 * (totalDataConsumed - 10);
	        } else {
	            billAmount = 400 + 3 * (totalDataConsumed - 30);
	        }

	        System.out.println("Monthly Bill Amount: RS." + billAmount);
	

	}
}


