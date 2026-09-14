package com.arrayQ;

public class RotateByKthPos {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        int k = 3;
        RotateArr(arr,k);
    }

    static void RotateArr(int[] arr, int k) {
        k = k % arr.length;

        for (int i = 0; i < k; i++) {
            int temp = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
