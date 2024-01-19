package com.SortingAlgorithms;

import java.util.Arrays;
public class QuickSort {
private int temp_array[];
private int len;
public void sort(int[] nums) {
// We are stoping when there is no element in the array
if (nums == null || nums.length == 0) {
return;
}
this.temp_array = nums;
len = nums.length;
quickSort(0, len - 1);
}
private void quickSort(int low_index, int high_index) {
int i = low_index;
int j = high_index;
// calculate pivot number
int pivot = temp_array[low_index+(high_index-low_index)/2];
// Divide into two arrays
while (i <= j) {
/// Dividing arrays to two halves. Left half will contain the values those
// are smaller than the pivot. Right half will contain elements those are
// larger than the pivot
while (temp_array[i] < pivot) {
i++;
}
while (temp_array[j] > pivot) {
j--;
}
// Swaping the elements so that larger number will
// go at the righ side.
if (i <= j) {
swapNumbers(i, j);
//move index to next position on both sides
i++;
j--;
}
}
// call quickSort() method recursively
if (low_index < j)
quickSort(low_index, j); // apply quick short on the numbers
// Those are smaller than the pivot
if (i < high_index)
quickSort(i, high_index); // For the numbers higher
// than the pivot
}
// This functions just swap the index position of two numbers
private void swapNumbers(int i, int j) {
int temp = temp_array[i];
temp_array[i] = temp_array[j];
temp_array[j] = temp;
}
// Main Method to test quick sort
public static void main(String args[])
{
QuickSort ob = new QuickSort();
int nums[] = {7, -5, 3, 2, 1, 0, 45};
System.out.println("Original Array:");
System.out.println(Arrays.toString(nums));
ob.sort(nums);
System.out.println("Sorted Array after applying quick sort");
System.out.println(Arrays.toString(nums));
}
}

