package controlstatements;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] arg)
	{
	
		int a,arm=0,n,num;
	
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter a number");
	
		n=obj.nextInt();
	
		num=n;
      
		for( ;n!=0;n/=10 )
	{
		a=n%10;
		
		arm=arm+(a*a*a);
	}
	
		if(arm==num)
	
			System.out.println(num+" is a armstrong number ");
	else
	
		System.out.println(num+" is not a armstrong number ");
        }
}


