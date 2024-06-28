package com.lou;

import java.util.Arrays;

public class Overloading {
    // function overloading happens in compile time
    public static void main(String[] args) {
        fun(13);
        fun(26, 27);
        fun("kai");
        fun(26, 27, 9, 88);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    // diff number of arg
    static  void fun(int a, int b) {
        System.out.println(a + "" + b);
    }

    // diff number of arg, using var. arg.
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // diff data type
    static void fun(String name) {
        System.out.println("Hello "+name);
    }
}
