package com.NumberSystem;
//Check whether the number is odd or even

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
//        System.out.println("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        int num = 44 ;
        EvnorOdd(num);
    }

    static void EvnorOdd(int n) {
        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else System.out.println("Even");
    }
}
