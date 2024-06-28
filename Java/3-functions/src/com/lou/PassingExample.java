package com.lou;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Louis";
        changeName(name, "Louisa");
        System.out.println(name);
    }

    static void changeName(String naam, String newName) {
        // this name is a new ref. val. which separated from the name in main
        naam = newName; // this ref. val. has scope only in this function
        System.out.println("Name changed? " + naam);
    }
}
