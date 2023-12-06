package com.collections;

import java.util.*;

public class QuizProgram {
	
	public static void main(String[] args) {

		int answer, result=0, number;
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter your name ");
		String name=obj.next();
		
		System.out.println("Table number ");
		int num= obj.nextInt();
		
		Random r = new Random();
		
		for(int i=1;i<=5;i++)
		{
			number = r.nextInt(12);
			System.out.print(number +" * "+ num + " = ");
			answer=obj.nextInt();
			
			
			if(answer== (number*num))
				result++;
		}
			
			System.out.println("hi, "+ name +" your score is  "+ result + "/" + "5");
		
	//System.out.println("otp number :" + r.nextInt()*2);	

	}
	


}
