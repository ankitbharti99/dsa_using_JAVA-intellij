package com.Recursion;

public class SumofDigits {
    static void main() {
        int n = 1342;
        System.out.println(sumofD(n));;
    }

    static int sumofD(int n) {
        int rem = n%10;
        if(n<=0) {
            return rem;
        }
        return rem + sumofD(n/10);
    }
}
