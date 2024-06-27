package com.lou;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a series of number: ");
        int num = in.nextInt();
        System.out.println("Please input the number you wanna find occurence: ");
        int ans = in.nextInt();
        int count = 0;
        while (num > 0) {
            if (num % 10 == ans) count++;
            num = num / 10;
        }
        System.out.println(ans + " appears " + count + " times.");
    }
}
