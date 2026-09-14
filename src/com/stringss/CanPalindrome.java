package com.stringss;
// Print True or False if the given word can be converted into Palindrome.

public class CanPalindrome {
    static void main() {
        String word = "abbacecd";
        if(canPalindrome(word)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean canPalindrome(String str) {
        boolean isEven;
        if(str.length() % 2 == 0) {
            isEven = true;
        } else isEven = false;

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] % 2 != 0) {
                count++;
            }
        }

        if (isEven) {
            if(count == 0) return true;
        } else {
            if(count == 1) return true;
        }
        return false;
    }
}
