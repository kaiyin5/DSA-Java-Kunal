package com.lou;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (b > a) {
            a = b;
        }
        if (c > a) {
            a = c;
        }

        System.out.println(a);
    }
}
