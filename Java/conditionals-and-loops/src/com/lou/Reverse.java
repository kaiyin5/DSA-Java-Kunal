package com.lou;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the number you wanna reverse: ");
        int num = in.nextInt();
        int ans = 0;
        while (num > 0) {
            ans *= 10;
            ans += num % 10;
            num /= 10;
        }
        System.out.println(ans);
    }
}
