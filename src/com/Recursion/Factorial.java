package com.Recursion;

public class Factorial {
    static void main() {
        int n = 6;
        System.out.println(fact(n));
    }

    static int fact(int n) {
        if(n<2) {
            return n;
        }

        return n * fact(n-1);
    }
}
