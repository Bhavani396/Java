package controlstatements;

import java.util.Scanner;

public class table {
	
	public static void main(String[] args) {
		
		
		int i,N,R;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Table no. ");
		N=obj.nextInt();
		
		
		System.out.println("Enter Range ");
		R=obj.nextInt();
		
		for(i=1; i<=R; i++)
			
			System.out.println(i+"x"+"N"+"="+(i*N));
			
			
		}

}
