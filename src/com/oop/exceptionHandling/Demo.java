package com.oop.exceptionHandling;

public class Demo {
    static void main() {
        try {
            Main.divide(5,0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
