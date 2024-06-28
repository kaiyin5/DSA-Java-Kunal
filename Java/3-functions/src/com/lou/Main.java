package com.lou;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sum_para(20, 30));

    }

    /*
        return_type fn_name (arguments) {
            // body
            return statement;
        }
    */

    // return type of void (no return)
    static void sum_void() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    // return type of int
    static int sum_int() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum; // return an int
    }

    // return type of String
    static String greet() {
        String greeting = "How are you";
        return greeting;
    }

    // taking parameters
    static int sum_para(int a, int b) {
        return a + b;
    }
}
