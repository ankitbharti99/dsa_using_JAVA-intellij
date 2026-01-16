package com.Sorting.CyclicSortLeetcodeQ;
//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int[] result = Mismatch(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] Mismatch(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correctIndx = nums[i] - 1;

            if(nums[i] != nums[correctIndx]) {
                swap(nums, i, correctIndx);
            } else {
                i++;
            }
        }

//        int[] ans = new int[2];
//        ans[0] = -1;
//        ans[1] = -1;

        for(int index = 0; index<nums.length; index++) {
            if(nums[index] != index+1) {

//                ans[0] = nums[index];
//                ans[1] = index+1;
                //     OR
                return new int[] {nums[index], index+1};
            }
        }
//        return ans;
        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
