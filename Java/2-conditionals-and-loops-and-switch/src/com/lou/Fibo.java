package com.lou;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which sequence of Fibo number you are looking for?");
        int n = in.nextInt();
//      initializing the first two numbers
        int a = 0;
        int b = 1;
        if (n <= 0) {
            System.out.println("The 1st Fibo number is " + a);
        } else if (n == 1) {
            System.out.println("The 2nd Fibo number is " + b);
        } else {
            int c;
            for (int i = 1; i < n; i++) {
                c = b;
                b += a;
                a = c;
            }
            System.out.println("The " + n + "th Fibo number is " + b);
        }


    }
}
