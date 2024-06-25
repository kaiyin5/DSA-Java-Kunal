package com.lou;

public class Loops {
    public static void main(String[] args) {

        // fori + tab will create a simple for loop
//        for (int i = 0; i < 3; i++) {
//            System.out.println(i * 4);
//        }

        // while loop
//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

        // when to use for and while loops
        // unknown times of looping -> while loop
        // known times of looping -> for loop

        // do while loop: loop executes at least once
        int n = 10;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
