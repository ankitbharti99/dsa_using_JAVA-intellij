package com.Recursion;

public class ReduceNumToZeros1342 {
    public static void main(String[] args) {
        int num = 7;
        System.out.println((numberofSteps(num)));
    }

    static int numberofSteps(int num) {
        return helper(num,0);
    }

    static int helper(int n, int count) {
        if(n==0) return count+1;

        if(n % 2 == 0) return helper(n/2,count+1);
        else return helper(n-1, count+1);
    }
}
