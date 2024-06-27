package com.lou;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a number");
        int num = in.nextInt();
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        if (num == sum && num != 1) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
