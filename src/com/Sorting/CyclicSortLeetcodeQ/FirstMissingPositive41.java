package com.Sorting.CyclicSortLeetcodeQ;

public class FirstMissingPositive41 {
    public static void main(String[] args) {
        int[] arr = {2147483647,2147483646,2147483645,3,2,1,-1,0,-2147483648};
        int result = find(arr);
        System.out.println(find(arr));
    }

    static int find(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndx = nums[i]-1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndx]) {
                swap(nums, i, correctIndx);
            } else {
                i++;
            }
        }

        //search for first missing number
        for(int j=0;j<nums.length;j++) {
            if(nums[j] != j+1) {
                return j+1;
            }
        }

        //case 2
        return nums.length+1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
