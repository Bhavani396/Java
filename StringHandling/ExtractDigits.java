package com.StringHandling;

import java.util.*;

public class ExtractDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string with alpha and numerals");
		String str=sc.next();
		String digits="", alpha="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(Character.isDigit(ch))
			{digits=digits+ch;
			}
			else if(Character.isAlphabetic(ch))
				alpha=alpha+ch;
		}
		
		System.out.println("Extracted code is "+ digits);
		System.out.println("Extracted chars is "+ alpha);
		
	
	}

}
