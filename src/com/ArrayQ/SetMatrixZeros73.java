package com.ArrayQ;

public class SetMatrixZeros73 {
    static void main() {
        int[][] arr = {
                {1, 0, 1},
                {0, 1, 1},
                {1, 1, 1}
        };
        setZero(arr);
    }

    static void setZero(int[][] arr) {
        boolean firstRow = false;
        boolean firstCol = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    if(i==0)firstRow = true;
                    if(j==0)firstCol = true;
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        if(firstRow)
            for(int j=0;j<arr.length;j++) {
                    arr[0][j] = 0;
                }

        if(firstCol)
            for(int i=0;i<arr[0].length;i++) {
                arr[i][0] = 0;
            }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
