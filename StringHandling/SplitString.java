package com.StringHandling;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string with alpha and numerals");
		String str=sc.nextLine();
		
		System.out.println("Given string: \n"+ str);
		
		//split the words using space and store them into a array of objects
		String[] splitstring = str.split("\\s+");
		
		//for each loop
		for(String s : splitstring)
		System.out.println(s); 

	}

}
