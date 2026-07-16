package com.oop.exceptionHandling;

public class Main {
    static void main() {
        int a = 11;
        int b = 0;

        String str = null;
        try{
            int num = a/b;
//            System.out.println(str.length());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
