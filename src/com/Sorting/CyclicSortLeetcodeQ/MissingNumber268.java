package com.Sorting.CyclicSortLeetcodeQ;
//https://leetcode.com/problems/missing-number/description/

public class MissingNumber268 {
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        int missingN = find(arr);
        System.out.println(missingN);
    }

    static int find(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndx = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndx]) {
                swap(nums, i, correctIndx);
            } else {
                i++;
            }
        }

        //search for first missing number
        for(int j=0;j<nums.length;j++) {
            if(nums[j] != j) {
                return j;
            }
        }

        //case 2
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
