package com.NumberSystem;

public class Question13 {
    public static void main(String[] args) {
        int[][] arr= {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans = FlipImage(arr);
        for(int i=0;i< arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int[][] FlipImage(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int temp = arr[i][j] ^ 1;
                arr[i][j] = arr[i][arr[i].length - 1 - j] ^ 1;
                arr[i][arr[i].length - 1 - j] = temp;
            }
            // invert middle element if length is odd
            if (arr[i].length % 2 == 1) {
                arr[i][arr[i].length / 2] ^= 1;
            }
        }

        return arr;
    }

}
