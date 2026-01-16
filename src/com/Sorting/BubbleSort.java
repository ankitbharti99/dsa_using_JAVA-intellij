package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {2,3,5,1,-4};
        int[] arr = {1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums) {
        boolean swapped = false;
        for (int i=0;i< nums.length-1;i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) break;
        }
    }
}
