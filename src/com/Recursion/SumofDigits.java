package com.Recursion;

public class SumofDigits {
    static void main() {
        int n = 9005;
        System.out.println(sumofD(n));;
    }

    static int sumofD(int n) {
        if(n==0) {
            return 0;
        }
        return (n%10) + sumofD(n/10);
    }
}
