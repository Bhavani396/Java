package com.StringHandling;

import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        int alphabetCount = 0;
        int digitCount = 0;
        int wordCount = 0;
        int spaceCount = 0;
        int symbolCount = 0;

        for (char c : inputString.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabetCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else {
                symbolCount++;
            }
        }

        // Counting words
        String[] words = inputString.split("\\s+");
        wordCount = words.length;

        // Displaying the results
        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Symbols: " + symbolCount);
    }
}