package com.OOP.packages.a;

import static com.OOP.packages.a.Message.printsomething;

public class Greetings {
    public static void main() {
        System.out.println("a");

        System.out.println("By default functions in java is 'package-private' means it can be accessed withing the package only");
        printsomething();
    }

    public static void message() {
        System.out.println("Hello world");
    }
    static void message2() {
        System.out.println("No access specifier means 'default' or 'package-private'");
        System.out.println("Hello again!!!");
    }
}
