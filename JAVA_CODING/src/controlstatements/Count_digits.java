package controlstatements;

import java.util.Scanner;

public class Count_digits {
	
public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int n, n1, n2,count=0, r, sum=0;
		
		System.out.println("Enter your number ");
		
		
		n=obj.nextInt();
		
		n2=n1=n;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		System.out.println("Count of digits "+ count);
		
		while (n1>0)
		{
			int p=1;
			
			r=n1%10;
			
			for(int i=1;i<=count;i++)
				
				p=p*r;
			
			sum=sum+p;
			
			n1=n1/10;
		}
		System.out.println("Sum ="+ sum);
		
		if(sum==n2)
			
			System.out.println("Armstrong number");
		else
			
			System.out.println("Not an Armstrong number");
		

	}

}

	



