package com.SortingAlgorithms;

public class BubbleSortExample {
public static void main(String[] args) {
int[] arr = {64, 34, 25, 12, 22, 11, 90};
System.out.println("Original Array:");
printArray(arr);
// Perform Bubble Sort
bubbleSort(arr);
System.out.println("\nSorted Array:");
printArray(arr);
}
// Function to perform Bubble Sort
public static void bubbleSort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
// Last i elements are already sorted, so no need to check them
for (int j = 0; j < n - i - 1; j++) {
// Compare adjacent elements and swap them if they are in the wrong order
if (arr[j] > arr[j + 1]) {
// Swap arr[j] and arr[j + 1]
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
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
