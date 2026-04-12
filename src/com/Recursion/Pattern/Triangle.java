package com.Recursion.Pattern;

import java.util.Scanner;

public class Triangle {
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
            printPattern(n, temp-1);
            System.out.print("*" + " ");
        }
        else{
            printPattern(n-1, n-1);
            System.out.println();
        }
    }
}
