package com.StringHandling;

import java.util.Scanner;

public class VowelReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the letter for vowel replacement: ");
        char replacementLetter = scanner.next().charAt(0);

        String encodedString = inputString.replaceAll("[AEIOUaeiou]", String.valueOf(replacementLetter));

        System.out.println("Original String: " + inputString);
        System.out.println("Encoded String: " + encodedString);
    }
}
