package com.lou;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter empId");
        int empID = in.nextInt();

        switch (empID) {
            case 1 -> System.out.println("Louis");
            case 2 -> System.out.println("Adam");
            case 3 -> {
                System.out.println("Please enter dept");
                String department = in.next();
                switch (department) {
                    case "IT" -> System.out.println("IT dog");
                    case "management" -> System.out.println("dog");
                    default -> System.out.println("Which?");
                }
            }
            default -> System.out.println("Who?");
        }
    }
}
