package com.ankit;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Questions {

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)) {
        System.out.println("Prime");
    } else{
            System.out.println("Not Prime");
        }
    }
}
