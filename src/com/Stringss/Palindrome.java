package com.Stringss;

public class Palindrome {
    public static void main(String[] args) {
        String num = null;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(String num) {
        if (num == null || num.isEmpty()) return false;

        num = num.toLowerCase();

        int s = 0;
        int e = num.length()-1;

        while(s<=e) {
            if(num.charAt(s)==num.charAt(e)) {
                s++;
                e--;
            } else {
                return false;
            }
        }
        return true;
    }
}
