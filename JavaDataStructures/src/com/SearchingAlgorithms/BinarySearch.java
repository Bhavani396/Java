package com.SearchingAlgorithms;

import java.util.*;


public class BinarySearch {
	
	public static void searchElement(int[] arr, int search)
	{
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println(arr[i] + " is present at the "+ i+ " index position");
				found=true;
			}
		}
		
		if(found==false)
			System.out.println("Searching element not present in the array");
	}

	public static void main(String[] args) {
		
		int[] a = new int[10];
		int i, searching_element;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 elements ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+ i + " element ");
		
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter searching element from array ");
		searching_element = sc.nextInt();
		
		//calling the method to search given element
		BinarySearch.searchElement(a, searching_element);
		
		

	}

}
