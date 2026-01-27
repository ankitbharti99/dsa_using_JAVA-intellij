package com.NumberSystem;
//Number of set bits(1)
public class Question10 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits1(n));
//  ---2nd method---
        System.out.println(setBits2(n));
    }

    public static int setBits1(int n) {
        int count = 0;
        while(n>0) {
            if((n&1)==1) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int setBits2(int n) {
        int count=0;

        while(n>0) {
            count++;
            n = n & (n-1);
        }

        //OR
//        while(n>0) {
//            count++;
//            n -= (n & -n);
//        }
        return count;
    }
}
