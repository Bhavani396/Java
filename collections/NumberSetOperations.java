package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class NumberSetOperations {
    public static void main(String[] args) {
        // Create a HashSet to store numbers
        HashSet<Integer> numberSet = new HashSet<>();

        // Add elements to the HashSet
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(40);
        numberSet.add(50);

        // Display the original set of numbers
        System.out.println("Original Number Set: " + numberSet);

        // Check if the set contains a specific number
        int searchNumber = 30;
        if (numberSet.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the set.");
        } else {
            System.out.println(searchNumber + " is not present in the set.");
        }

        // Remove an element from the set
        int numberToRemove = 40;
        numberSet.remove(numberToRemove);
        System.out.println(numberToRemove + " has been removed from the set.");

        // Display the set of numbers after removal
        System.out.println("Number Set after removal: " + numberSet);

        // Iterate over the elements using an Iterator
        System.out.println("Iterating over the Number Set:");
        Iterator<Integer> iterator = numberSet.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }

        // Clear the set
        numberSet.clear();
        System.out.println("Number Set after clearing: " + numberSet);
    }
}