package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
	
	
public static void main(String[] args) {

			int[] array1 = new int[50];
			int i,n, sum, j;
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter no. of elements ");
			n=sc.nextInt();
			
			System.out.println("Enter  "+ n + " elements");
			
			for(i=0;i<n;i++)
				array1[i]=sc.nextInt();
			
			System.out.println("List of perfect numbers");
			for(i=0;i<n;i++)
			{
				sum=0;
				for(j=1;j<array1[i];j++)
				{
					if(array1[i]%j==0)
						sum+=+j;
				}
				
				if(sum==array1[i])
					System.out.println(array1[i]);
			}
			
			}

	}


