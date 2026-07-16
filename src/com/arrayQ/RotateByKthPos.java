package com.arrayQ;

public class RotateByKthPos {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        int k = 3;
        RotateArr(arr,k);
    }

    static void RotateArr(int[] arr, int k) {
        for(int i=0;i<arr.length;i++) {
            while((k-1) < arr.length-1) {
                int temp = arr[k-1];
                arr[k-1] = arr[k];
                arr[k] = temp;
            }
            k--;
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
