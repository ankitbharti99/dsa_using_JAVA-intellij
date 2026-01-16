package com.NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a Decimal number: ");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println(convert(num));
    }

    static String convert(int n) {
        String ans = "";

        while(n>0) {
            int rem = n%2;
            n = n / 2;
            ans += rem;
        }
        return ans;
    }
}
