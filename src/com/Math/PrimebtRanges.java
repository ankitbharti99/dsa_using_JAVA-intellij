package com.Math;
//Prime between ranges

public class PrimebtRanges {
    public static void main(String[] args) {
    int n=40;
    for(int i=0;i<=n;i++) {
        if(isPrime(i) == true) {
            System.out.print(i+" ");
        }
    }
}

    static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}