package com.Recursion;

public class ProdofDigits {
    static void main() {
        int n = 90205;
        System.out.println(prod(n));;
    }

    static int prod(int n) {
        if(n%10 == 0) return prod(n/10);
        if((n%10)==n) {
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
