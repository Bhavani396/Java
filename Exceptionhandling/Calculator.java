package com.Exceptionhandling;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            double result;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
            } else {
                System.out.println("Error: Invalid operator");
                return;
            }

            System.out.println("Result: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        }

        input.close();
    }
}
	
	
	


