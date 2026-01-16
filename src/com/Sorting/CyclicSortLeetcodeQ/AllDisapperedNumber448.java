package com.Sorting.CyclicSortLeetcodeQ;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class AllDisapperedNumber448 {
    public static void main(String[] args) {
        int[] nums = {1,1};
        AllDisapperedNumber448 obj = new AllDisapperedNumber448();
        List<Integer> missing = obj.findDisappearedNumbers(nums);

        System.out.println(missing);
    }

    public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndx = nums[i] - 1;
            if (nums[i] != nums[correctIndx]) {
                swap(nums, i, correctIndx);
            } else {
                i++;
            }
        }

        // just find missing numbers
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
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
