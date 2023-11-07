package Arrays;

import java.util.*;

public class Sales_Process {

	public static void main(String[] args) {
		
		String[] prd_name = new String[20];
		
		float[] qty = new float[20];
		float[] price = new float[20];
		float[] sales_amt = new float[20];
		
		float total_sales=0, average_sales, min_sales, max_sales;
		
		int i, n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many sales records? ");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter productname ");
			prd_name[i]= sc.next();
			System.out.println("Enter quntity of sales");
			qty[i]=sc.nextFloat();
			System.out.println("Enter sales price per unit");
			price[i]=sc.nextFloat();
			sales_amt[i]= qty[i]*price[i];
			
			total_sales = total_sales + sales_amt[i];
			
		}
		
		average_sales = total_sales/n;
		
		min_sales= sales_amt[0];
		max_sales=sales_amt[0];
		
		for(i=0;i<n;i++)
		{
			if(sales_amt[i]>max_sales)
			{	max_sales=sales_amt[i];}
			
			if(sales_amt[i]<min_sales)
				{min_sales=sales_amt[i];}
		}
		
		//printing the records
		
		for(i=0;i<n;i++)
			System.out.println(prd_name[i]+"\t"+qty[i]+"\t"+price[i]+"\t"+ sales_amt[i]);
		
		System.out.println();
		
		System.out.println("total sales amount "+ total_sales);
		System.out.println("Minimum sales amount "+ min_sales);
		System.out.println("Maximum sales amount "+ max_sales);
		
		
		
		

	}

}
