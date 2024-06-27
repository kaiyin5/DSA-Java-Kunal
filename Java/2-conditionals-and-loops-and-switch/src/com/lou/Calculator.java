package com.lou;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Operators available: +, -, *, /, %; Input x or X to exit");
        int ans = 0;
        // Take user input till X or x is input
        while (true) {
            System.out.print("Please enter the operator: ");
            char operator = in.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                // Take two numbers from user
                System.out.print("Please enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (operator == '+') {
                    ans = num1 + num2;
                } else if (operator == '-') {
                    ans = num1 - num2;
                } else if (operator == '*') {
                    ans = num1 * num2;
                } else if (operator == '/') {
                    if (num2 == 0) {
                        System.out.println("Cannot be divided by 0!");
                        continue;
                    }
                    ans = num1 / num2;
                } else {
                    if (num2 == 0) {
                        System.out.println("Cannot be divided by 0!");
                        continue;
                    }
                    ans = num1 % num2;
                }
                System.out.println("The result is: " + ans);
            } else if (operator == 'x' || operator == 'X') {
                // Exit the loop
                break;
            } else {
                System.out.println("Invalid operator, please try again.");
                System.out.println("Operators available: +, -, *, /, %; Input x or X to exit");
            }
        }
    }
}
