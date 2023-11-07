package controlstatements;

import java.util.Scanner;

public class Sum_series {

	public static void main(String[] args) {

		int i;
		int n, sum=0;
		
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter the limit of the series");
		n=obj.nextInt();
		
		
		
		for(i=1; i<=n; i++)
			
		sum+=n;  
		
		System.out.println("sum of the series 1+2+3....n is "+ sum); 
		
		

	}

}
