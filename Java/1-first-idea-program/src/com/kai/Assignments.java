package com.kai;

import java.util.Scanner;
import java.lang.Math;

public class Assignments {
    public static void main(String[] args) {
        // 1. Write a program to print whether a number is even or odd, also take input from the user.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input a number to check if it's even or odd: ");
//        int num = input.nextInt();
//        if (num % 2 == 0) {
//            System.out.println(num + " is an even number.");
//        } else {
//            System.out.println(num + " is an odd number.");
//        }
        // 9. To find Armstrong Number between two given number.
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            int tmp = num2;
            num2 = num1;
            num1 = tmp;
        }

        for (int i = num1; i <= num2; i++) {
            int sum = 0;
            int dum = i;
            while (dum > 0) {
                int digit = dum % 10;
                sum += digit*digit*digit;
                dum /= 10;
            }
            if (i == sum) {
                System.out.println(i + " is a Armstrong number.");
            }
        }
    }
}
