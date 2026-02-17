package com.Recursion;

public class CountZero {
    static void main() {
        int n = 104070;
        System.out.println(CZero(n,0));
    }

    static int CZero(int n, int count) {
        if(n==0) return count;
        if(n%10 == 0) return CZero(n/10, ++count);
        else {
            return CZero(n/10,count);
        }
    }

}
