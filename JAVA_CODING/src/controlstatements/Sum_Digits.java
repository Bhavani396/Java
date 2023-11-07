package controlstatements;

import java.util.Scanner;

public class Sum_Digits {

	public static void main(String[] args) {

		int n;
		
		int sum, r, count, rev=0;
		
		Scanner obj = new Scanner(System.in);
		
		
		System.out.println("Enter an integer input ");
		
		n=obj.nextInt();
		
		count=sum=0;
		
		while(n>0) 
		{
			
			r=n%10; 
			
			sum+=r; 
			
			n=n/10; 			
			
			count++;  
			
			rev=(rev*10)+r;
			
		}
		
		System.out.println("Sum of digits "+ sum);
		System.out.println("count of digits "+ count);
		System.out.println("reverse of digits "+ rev);

	}

}

