package com.StringHandling;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        String changedCaseString = changeCase(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Changed Case String: " + changedCaseString);
    }

    private static String changeCase(String input) {
        // Using built-in String methods to change case
        return input.toUpperCase(); // or input.toLowerCase() for lowercase
    }
}
