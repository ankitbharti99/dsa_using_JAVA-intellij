package com.NumberSystem;
//Check if the number is Power of 2 or not.

public class Question8 {
    static void main() {
        int n = 0;
        System.out.println(isPowerOf2(n));
        isPowerOfTwo(n);
    }
    /*   --- 2nd Method---
    we & n with (n-1) so that if it is power of 2(10000) then it will always give 0 as 1 & 0 = 0.
       1 0 0 0 0 0 0 0
  &    0 1 1 1 1 1 1 1    = 0
 */
    static void isPowerOfTwo(int n) {
        if(n==0){
            System.out.println("Not a Power of 2");
            return;
        }
        int ans = n & (n-1);
        if(ans == 0) System.out.println("Power of 2");
        else System.out.println("Not a Power of 2");
    }


    static boolean isPowerOf2(int n) {
        int count = 0;
        while(n>0) {
            int last = n & 1;
            n = n >> 1;
            if(last == 1) count++;
        }
        if(count == 1) return true;
        return false;
    }
}
