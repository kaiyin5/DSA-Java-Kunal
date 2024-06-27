package com.kai;

public class TypeCasting {
    public static void main(String[] args) {
//        float num = input.nextFloat();

        // type casting
//        int num = (int)(56.78f); // 56

        // what's a byte
//        int a = 259;
//        byte b = (byte)(a); // b % a = 3

        // automatic type promotion in expressions
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);

        byte e = 50;
        // e * 2 become type of int so
//        e = e * 2; // this line is error
        System.out.println(3 * 6.6); // this returns float
    }
}
