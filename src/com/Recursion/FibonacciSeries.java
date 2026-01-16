package com.Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
//        int length = 10;
//        for(int i=0;i<length;i++) {
//            System.out.print(fibo(i) + " ");
//        }
        int ans = fibo(20);  //will not give answer after 41.  (reason- It calls function for the same number everytime it needs).
        System.out.println(ans);

        System.out.println(fiboWithFormula(65));
    }

    static long fiboWithFormula(int n) {
        return (long) (Math.pow(((1 + Math.sqrt(5))/2), n) / Math.sqrt(5));
    }

    static int fibo(int i) {

        if(i<2) {
            return i;
        }

        return fibo(i-1)+ fibo(i-2);
    }
}
