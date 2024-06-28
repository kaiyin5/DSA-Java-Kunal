package com.lou;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,3,4,5,6);
        multiple(2,3,"Ka", "i", "asd");
    }

    // explicitly init
    static void multiple(int a, int b, String ...v) {
        System.out.println(a+b);
        System.out.println(Arrays.toString(v));
    }

    // variable argument:
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
