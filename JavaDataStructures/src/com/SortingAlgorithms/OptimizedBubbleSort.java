package com.SortingAlgorithms;

public class OptimizedBubbleSort 
{
public static void main(String[] args) 
{
int[] arr = {64, 34, 25, 12, 22, 11, 90};

System.out.println("Original Array:");
   printArray(arr);
// Perform Optimized Bubble Sort
optimizedBubbleSort(arr);
System.out.println("\nSorted Array:");
   printArray(arr);
}
// Function to perform Optimized Bubble Sort
public static void optimizedBubbleSort(int[] arr) 
{
int n = arr.length;
boolean swapped;
for (int i = 0; i < n - 1; i++) 
{
swapped = false;
// Last i elements are already sorted, so no need to check them
for (int j = 0; j < n - i - 1; j++) 
{
// Compare adjacent elements and swap them if they are in the wrong order
if (arr[j] > arr[j + 1]) 
{
// Swap arr[j] and arr[j + 1]
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
swapped = true;
}
}
// If no swaps were made in this pass, the array is already sorted
if (!swapped) 
{
System.out.println("\nThe array is sorted after iteration " + i);
break;
}
}
}
// Utility function to print an array
public static void printArray(int[] arr) 
{
for (int value : arr) {
System.out.print(value + " ");
}
System.out.println();
}
}
