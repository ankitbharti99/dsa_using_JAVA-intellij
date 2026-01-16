package com.Sorting;

import java.util.Arrays; 

public class SelectionSort  {
    public static void main(String[] args) {
        int[] nums = {5,4,9,1,0,8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] arr) {

        for(int i=0;i<arr.length-1;i++) {
            int smallestIndx = i;
            for(int j=i+1;j< arr.length;j++) {
                if(arr[j]<arr[smallestIndx]) {
                    smallestIndx = j;
                }
            }
            int temp = arr[smallestIndx];
            arr[smallestIndx] = arr[i];
            arr[i] = temp;
        }
    }
}
