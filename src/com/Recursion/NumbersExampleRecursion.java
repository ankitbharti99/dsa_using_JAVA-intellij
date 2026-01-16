package com.Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        int num = 1;
            message(num);
    }

    static void message(int n) {

        if(n==5){
            System.out.println("Goooooooood Morniiiiiggg Noida " + n) ;
            return;
        }
        System.out.println("Goooooooood Morniiiiiggg Noida " + n);
        message(n+1);
    }
}
