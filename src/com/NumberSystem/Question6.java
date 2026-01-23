package com.NumberSystem;
//Number of Binary Digits

public class Question6 {
    static void main() {
//           ------1st Method-----
        int n = 180;
        System.out.println(countDigits(n));

//           ------OR-----
        //2nd Method (base can change to binary(2),decimal(10),octal(8),hexadecimal(16)
        int base = 2;
        int ans = (int) (Math.log(n) / Math.log(base) + 1);
        System.out.println(ans);
    }

    //1st Method
    static int countDigits(int n) {
        int count = 0;
        while(n>0) {
            int last = n & 1;
            n = n>>1;
            count++;
        }
        return count;
    }
}
