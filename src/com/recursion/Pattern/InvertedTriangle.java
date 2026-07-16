package com.recursion.Pattern;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        printPattern(row,row);

        sc.close();
    }

    static void printPattern(int row, int temp) {
        if(row==0) return;

        if(temp > 0) {
            System.out.print("*" + " ");
            printPattern(row, temp-1);
        }
        else{
        System.out.println();
        printPattern(row-1, row-1);
        }
    }
}
