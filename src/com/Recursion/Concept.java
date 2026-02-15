package com.Recursion;

public class Concept {
    public static void main(String[] args) {
//        fun1(5);          //Stackoverflow because of post decreement n--, it will always print 5
        fun2(5);
    }

    private static void fun2(int n) {
        if(n==0) return;

        System.out.println(n);
        fun2(--n);
    }

    private static void fun1(int n) {
        if(n==0) return;

        System.out.println(n);
        fun1(n--);
    }
}
