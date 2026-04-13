package com.Recursion.Sortings;

public class BubbleSort {
    static void main() {
        int[] arr = {2,6,1,4,3,7,5};
        BSort(arr,arr.length-1,0);
    }

    static void BSort(int[] arr,int row, int col) {
        if(row==0) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            return;
        }

        if(col<row) {
            if(arr[col] > arr[col+1]) {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            BSort(arr,row,col+1);
        } else{
            BSort(arr,row-1,0);
        }
    }
}
