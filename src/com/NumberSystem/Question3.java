package com.NumberSystem;
//Find i th bit of a number.


public class Question3 {
    public static void main(String[] args) {
        int num = 0b1111111;
        int i = 4;
        int ans = findIth(num, i);
        System.out.println(ans);
    }

    static int findIth(int num, int i) {
        int mask = 1<<i;
        return ((num & mask) == 0) ? 0 : 1;
    }
}