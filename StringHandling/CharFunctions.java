package com.StringHandling;

public class CharFunctions {

	public static void main(String[] args)throws Exception  {
		
		char ch;
		
		System.out.println("Enter a character");
		
		//read a single character		
		ch=(char)System.in.read();
		 
		if(Character.isAlphabetic(ch))
			System.out.println("you input is character");
		else if(Character.isDigit(ch))
			System.out.println("you input is Digit");
		else if(Character.isSpace(ch))
			System.out.println("you input is sapce character");
		else 
			System.out.println("you input is symbol");
		
		
		

	}

}