package com.SortingAlgorithms;

public class InsertionSort {
public static void main(String[] args) {
int[] arr = {69, 14, 25, 12, 22, 11, 10};
System.out.println("Original Array:");
printArray(arr);
// Perform Insertion Sort
insertionSort(arr);
System.out.println("\nSorted Array:");
printArray(arr);
}
// Function to perform Insertion Sort
public static void insertionSort(int[] arr) {
int n = arr.length;
for (int i = 1; i < n; i++) {
int key = arr[i];
int j = i - 1;
// Move elements of arr[0..i-1] that are greater than key
// to one position ahead of their current position
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
}
// Utility function to print an array
public static void printArray(int[] arr) {
for (int value : arr) {
System.out.print(value + " ");
}
System.out.println();
}
}
