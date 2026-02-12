package com.Recursion;

public class Sum {
    static void main() {
        int n = 4;
        System.out.println(sumOfN(n));
    }

    static int sumOfN(int n) {
        if(n<2) {
            return n;

        }
        return n + sumOfN(n-1);
    }
}
