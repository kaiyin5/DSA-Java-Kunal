package com.lou;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        System.out.println("Please input anything: ");

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is in lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is in uppercase");
        } else {
            System.out.println(ch + " is not a alphabet");
        }
    }
}
