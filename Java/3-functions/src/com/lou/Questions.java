package com.lou;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = in.nextInt();
        System.out.println(isPalindrome(n));
//        System.out.print("Enter 3 natural numbers: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        System.out.println(isPythagorean(a,b,c));
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Write a function to check if a given triplet is a Pythagorean triplet or not.
    static boolean isPythagorean(int a, int b, int c) {
        // first find the max.
        int max = a;
        if (max < b && b > c) {
            max = b;
            b = 0;
        } else if (max < c){
            max = c;
            c = 0;
        } else {
            a = 0;
        }
        return a*a+b*b+c*c == max*max;
    }

    // Write a function to find if a number is a palindrome or not. Take number as parameter.
    static boolean isPalindrome(int num) {
        int original = num;
        int sum = 0;
        while (num >= 1) {
            sum *= 10;
            sum += num % 10;
            num /= 10;
        }
        return sum == original;
    }
}
