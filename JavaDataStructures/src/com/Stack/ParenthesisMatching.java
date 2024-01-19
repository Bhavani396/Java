package com.Stack;

import java.util.Stack;
/**
*
* This class checks if a String containing parentheses is a valid parentheses
* or not.
*
*/
public class ParenthesisMatching {
public static boolean isParenthesisMatched(String input) {
Stack<Character> stack = new Stack<>();
// Takes char from the String one by one
for (char c : input.toCharArray()) {
// If parentheses are open then add to stack.
if (isOpenParenthesis(c)) {
stack.push(c);
}
// If it is closing then check if the char is matching with the last
// opening parentheses.
// If matches then remove the closing parentheses from the stack
else if (isCloseParenthesis(c)) {
if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
return false;
}
}
}
return stack.isEmpty();
}
// This function see if the character from the stack is
// a open parenthesis.
private static boolean isOpenParenthesis(char c) {
return c == '(' || c == '{' || c == '[';
}
private static boolean isCloseParenthesis(char c) {
return c == ')' || c == '}' || c == ']';
}
private static boolean isMatchingPair(char open, char close) {
return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close
== ']');
}
public static void main(String[] args) {
String input1 = "({})"; // Balanced
String input2 = "{[()]()}"; // Balanced
String input3 = "([)]"; // Not balanced
String input4 = "((())()){{[[]]}}"; // Balanced
System.out.println("Input 1 is balanced: " + isParenthesisMatched(input1));
System.out.println("Input 2 is balanced: " + isParenthesisMatched(input2));
System.out.println("Input 3 is balanced: " + isParenthesisMatched(input3));
System.out.println("Input 4 is balanced: " + isParenthesisMatched(input4));

}

}