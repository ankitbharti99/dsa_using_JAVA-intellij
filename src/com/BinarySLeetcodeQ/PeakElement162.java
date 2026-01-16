package com.BinarySLeetcodeQ;
/*
You are given an array where a peak element is one that is greater than its neighbors.
Multiple peaks can exist. Not necessarily a mountain. Could be all increasing, decreasing, or flat in parts.
Example - Input: arr = [1,2,1,3,5,1,6,4]
Output: 5
 */
// Note - If the array contains multiple peaks, return the index to any of the peaks.
public class PeakElement162 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,1,5,4};
        int result = Peak(arr);
        System.out.println(result);
    }

    static int Peak(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                e = mid;
            } else {
                // you are in asc part of array
                s = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return s; // or return end as both are =
    }
}
