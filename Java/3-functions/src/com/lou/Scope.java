package com.lou;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
//            int a = 33; // already init outside the block, cannot re-init
            a = 78;
            int c = 99;
            // value initialised within block, will remain in block
        }
        System.out.println(a+" "+b); // cannot print c here, outside the block
    }
}
