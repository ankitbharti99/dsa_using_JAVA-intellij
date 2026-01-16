package com.ankit;

public class Shadowing {
    static String word = "Shadow"; //this will be shadowed in line 8 when that variable is actually initialised.

    public static void main(String[] args) {
        System.out.println(word);
        String word = "Not shadow"; //the class variable at line 4 is shadowed by this
        System.out.println(word);
        print();
    }

    static void print() {
        System.out.println(word);
    }
}
