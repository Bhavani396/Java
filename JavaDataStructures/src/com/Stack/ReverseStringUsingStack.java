package com.Stack;

import java.util.Stack;
public class ReverseStringUsingStack {
public static String reverseString(String input) {
Stack<Character> stack = new Stack<>();
// Push each character from the input string onto the stack
for (char c : input.toCharArray()) {
stack.push(c);
}
// Pop characters from the stack and append them to a new string
StringBuilder reversedString = new StringBuilder();
while (!stack.isEmpty()) {
reversedString.append(stack.pop());
}
return reversedString.toString();
}
public static void main(String[] args) {
String input = "Hello, World!";
String reversed = reverseString(input);
System.out.println("Original string: " + input);
System.out.println("Reversed string: " + reversed);
}
}
