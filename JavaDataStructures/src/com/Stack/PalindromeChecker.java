package com.Stack;

import java.util.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters from the stack and compare with the original string
        for (int i = 0; i < input.length(); i++) {
            if (stack.pop() != input.charAt(i)) {
                return false; // Characters don't match, not a palindrome
            }
        }

        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        // Test the function with some examples
        String str1 = "racecar";
        String str2 = "hello";

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
    }
}