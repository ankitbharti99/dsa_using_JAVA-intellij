package com.oop.packages.b;

import static com.oop.packages.a.Greetings.message;

public class Greetings {
    static void main() {
        System.out.println("b");

        System.out.println("message() function imported from another package by making it to public");
        message();
    }
}
