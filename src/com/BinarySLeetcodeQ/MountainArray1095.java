package com.BinarySLeetcodeQ;

public class MountainArray1095 {
    public static void main(String[] args) {
        int[] arr = {1,5,2};
        int endI = Peak(arr);
        int result = findingTarget(arr,endI,2);
        System.out.println(result);
    }

    static int Peak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

    static int findingTarget(int[] nums, int e, int target) {
        int s = 0;

        while(s<=e) {
            int mid = s + (e-s)/2;

            if(nums[mid] == target) return mid;

            if(target<nums[mid]) {
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }

        s = e;
        e = nums.length;
        while(s<=e) {
            int mid = s + (e-s)/2;

            if(nums[mid] == target) return mid;

            if(target>nums[mid]) {
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
}
