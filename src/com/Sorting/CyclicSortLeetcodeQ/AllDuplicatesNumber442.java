package com.Sorting.CyclicSortLeetcodeQ;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;

public class AllDuplicatesNumber442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        AllDuplicatesNumber442 obj = new AllDuplicatesNumber442();
        ArrayList<Integer> dublicates = obj.AllDuplicates(arr);

        System.out.println(dublicates);
    }

    public ArrayList<Integer> AllDuplicates(int[] nums) {
        int i=0;
        ArrayList<Integer> result = new ArrayList<>();

        while(i<nums.length) {
                int correctIndx = nums[i] - 1;
                if (nums[i] != nums[correctIndx]) {
                    swap(nums, i, correctIndx);
                } else {
                i++;
                }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
