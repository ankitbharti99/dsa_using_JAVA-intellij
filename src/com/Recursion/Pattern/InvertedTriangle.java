package com.Recursion.Pattern;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        printPattern(row,row);

        sc.close();
    }

    static void printPattern(int n, int temp) {
        if(n==0) return;

        if(temp > 0) {
            System.out.print("*" + " ");
            printPattern(n, temp-1);
        }
        else{
        System.out.println();
        temp = n-1;
        printPattern(n-1, temp);
        }
    }
}
