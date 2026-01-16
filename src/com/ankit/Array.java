package com.ankit;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        String[] str = {"I ","am ",null,"robo"};
//        for(int i=0;i<400;i++) {
//            System.out.println(str[i]);
//        }

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(new int[]{arr[1][1]}));
    }
}
