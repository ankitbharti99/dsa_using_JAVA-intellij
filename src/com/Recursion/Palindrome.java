package com.Recursion;

public class Palindrome {
    static void main() {
        int n = 1321;
        int revN = reverse(n);
        System.out.println(isPalindrome(n,revN));;
    }

    static int sum = 0;
    static int reverse(int n) {
        int rem = 0;
        rem = n%10;

        if(n == 0) return sum;

        sum = sum*10+rem;
        return reverse(n/10);
    }

    static boolean isPalindrome(int n, int rev) {
        if(n == rev) return true;
        return false;
    }
}
