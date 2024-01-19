package com.SearchingAlgorithms;

import java.io.*;
public class LinearSearch
{
public static int search(int arr[], int N, int x)
{
for (int i = 0; i < N; i++)
{
// Checking if the value specified in x is present in the array
if (arr[i] == x)
return i; // if present, return the index
}
return -1; // if not present, return -1
}
public static void main(String args[])
{
int arr[] = { 2, 3, 4, 10, 40 };
int x = 10;
// Calling the search function to check for the element
int result = search(arr, arr.length, x);
if (result == -1)
System.out.print("Element is not present in array");
else
System.out.print("Element is present at index "+ result);
}
}