package com.BinarySLeetcodeQ;

public class RoatatedArray33 {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int result = search(arr, 5 );
        System.out.println(result);
    }

    static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int e2 = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        int peak = e;
        int peak2 = e;


        s = 0;
        while (s <= peak) {
            int mid = s + (peak - s) / 2;

            if (nums[mid] == target) return mid;

            if (target < nums[mid]) {
                peak = mid - 1;
            } else {
                s = mid + 1;
            }
        }


        while (peak2 <= e2) {
            int mid = peak2 + (e2 - peak2) / 2;

            if (nums[mid] == target) return mid;

            if (target < nums[mid]) {
                e2 = mid - 1;
            } else {
                peak2 = mid + 1;
            }
        }
        return -1;
    }
}
