package com.SortingAlgorithms;

import java.util.Arrays;
public class MergeSortExample
{
// This merge method is the basic step in merge sort.
// For example if we have two arrays
// Left array - {2, 8, 10} and Right array {7, 8, 10, 11 } as input.
// The output array will be {2, 7, 8, 10, 10, 11}
// For simplicity we are not using two left and right arrays
// But making a bigger temp array to store both left and righ arrays.
// Only the index values of the array will divide the values
// of left and right subarrays.
// Merge two sorted subarrays `arr[low … mid]` and `arr[mid+1 … high]`
public static void merge(int[] arr, int low, int mid, int high)
{
int k = low, i = low, j = mid + 1;
// We use this temprary array to store the sorted value.
// This temporary array holds both values of left and right the subarrays.
int [] temp=new int [arr.length];
// while there are elements in the left and right runs
while (i <= mid && j <= high)
{
if (arr[i] <= arr[j]) {
temp[k++] = arr[i++];
}
else {
temp[k++] = arr[j++];
}
}
// Copy remaining elements
// For example we have two sorted array {1, 2 ,8} and {3, 4, 10, 11, 12, 19}
// After traversing elements from the starting element it will
// reach the int 8. Then sorted array will be 1,2,3,4,8}
// Now there will be no item left in the first array.
// So instead of comparing two arrays we will just append the remaining
// elements from right array that is not empty.
while (i <= mid) {
temp[k++] = arr[i++];
}
while (j <= high) {
temp[k++] = arr[j++];
}
// copy back to the original array to reflect sorted order
for (i = low; i <= high; i++) {
arr[i] = temp[i];
}
}
// We start with the original array. Divide them in two part and then call
// the merge function recursively.
// Sort array `arr[low…high]`
public static void mergesort(int[] arr, int low, int high)
{
// base case
// If size is one then array is considered sorted.
if (high <= low) { // if run size <= 1
return;
}
// find midpoint
int mid = (low + high)/2;
// recursively split runs into two halves until run size <= 1,
// then merge them and return up the call chain
mergesort(arr, low, mid); // split/merge left half
mergesort(arr, mid + 1, high); // split/merge right half
merge(arr, low, mid, high); // merge the two half runs
}
// Function to check if an array is sorted in ascending order or not
public static boolean isSorted(int[] arr)
{
int prev = arr[0];
for (int i = 1; i < arr.length; i++)
{
if (prev > arr[i])
{
System.out.println("MergeSort Fails!!");
return false;
}
prev = arr[i];
}
return true;
}
// Verifying the result of merge sort algorithm in main program
public static void main(String[] args)
{
int[] arr = {38,27,43,3,9,82,10};
System.out.println ("The original array is:\n" + Arrays.toString(arr));
// sort the array `arr`
mergesort(arr, 0, arr.length - 1);
if (isSorted(arr)) {
System.out.println("The array after Merge Sort is:\n"+ Arrays.toString(arr));
}
}
}
