package com.SearchingAlgorithms;

import java.util.*;
public class InterpolationSearch {
// If x is present in arr[0..n-1], then returns
// index of it, else returns -1.
public static int interpolationSearch(int arr[], int lo,int hi, int x)
{
int pos;
// Since array is sorted, an element
// present in array must be in range
if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
// Probing the position with keeping
// uniform distribution in mind.
pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));
// System.out.println(pos); // optional to check the position
// Condition of target found
if (arr[pos] == x)
return pos;
// If x is larger, x is in right sub array
if (arr[pos] < x)
return interpolationSearch(arr, pos + 1, hi, x); // recursive search
// If x is smaller, x is in left sub array
if (arr[pos] > x)
return interpolationSearch(arr, lo, pos - 1,x); // recursive search
}
return -1;
}
public static void main(String[] args)
{
// Array of items on which search will
// be conducted.
int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
int n = arr.length;
// Element to be searched
int x = 18;
int index = interpolationSearch(arr, 0, n - 1, x);
// If element was found
if (index != -1)
System.out.println("Element found at index " + index);
else
System.out.println("Element not found.");
}
}