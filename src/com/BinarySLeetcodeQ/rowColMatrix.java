package com.BinarySLeetcodeQ;

import java.util.Arrays;

public class rowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {12, 24, 36, 46},
                {17, 25, 38, 50},
                {21, 31, 42, 60},
                {41, 51, 71, 80}
        };
        System.out.println(Arrays.toString(search(arr,71)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) {
                return new int[] {r,c};
            }

            if(matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
