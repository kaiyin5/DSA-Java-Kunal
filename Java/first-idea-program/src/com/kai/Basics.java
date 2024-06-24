package com.kai;

public class Basics {
    public static void main(String[] args) {
        // use while you dun know how many times gonna run
        int count = 1;
        while(count < 5) {
            System.out.println(count);
            count++;
        }

        // use for while you know the time of loop
        for (int i = 1; i != 5; i++) {
            System.out.println("i is: " + i);
        }
    }
}
