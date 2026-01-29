package com.NumberSystem;
//XOR of numbers between the given range.
public class Question12 {
    public static void main(String[] args) {
        int s = 3;
        int l = 9;
        int ans = findXOR(l) ^ findXOR(s-1);
        System.out.println(ans);
    }
    static int findXOR(int n) {
        if(n % 4 == 0) return n;
        else if(n % 4 == 1) return 1;
        else if(n % 4 == 2) return n+1;
        else if(n % 4 == 3) return 0;
        return 0;
    }
}

/* Logic
The program first finds the XOR result up to a number using this pattern.

To get the XOR between two numbers, it removes the part before the start number.
What’s left is the answer for that range.

Common numbers cancel out, leaving only the XOR from s to l.
 */