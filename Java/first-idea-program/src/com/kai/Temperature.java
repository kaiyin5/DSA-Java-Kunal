package com.kai;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input temp in C: ");
        float tempC = input.nextFloat();
        float tempF = tempC * 9 / 5 + 32;
        System.out.println("The F temp is: " + tempF);
    }
}
