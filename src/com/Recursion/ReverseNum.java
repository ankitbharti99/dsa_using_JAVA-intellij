package com.Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n));;
    }

    static int sum = 0;
    static int reverse(int n) {
        int rem = 0;
        rem = n%10;

        if(n == 0) return sum;

        sum = sum*10+rem;
        return reverse(n/10);
    }
}