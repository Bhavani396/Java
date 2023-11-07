package Arrays;

import java.util.*;

public class Array_Demo2 {
	
	
	

		public static void main(String[] args) {
			
			
			float[] avg = new float[5]; //array
			
			String[] sname = new String[5]; //array of objects
			
			Scanner sc= new Scanner(System.in);
			
			for(int i=0;i<avg.length;i++)
			{
				
				System.out.println("Enter "+ i + " student name");
				
				sname[i]=sc.next();
				
				System.out.println("Enter "+ i + " averagae marks ");
				
				avg[i]= sc.nextFloat();
			}
			
			//display all the data from array
			for(int i=0;i<avg.length;i++)
				
				System.out.println(avg[i]+"\t"+ sname[i]);

		}

	}


