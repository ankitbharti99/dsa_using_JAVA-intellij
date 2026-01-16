package com.ankit;
//Find first index of the target element using Binary Search.

public class FirstEinSortedArr {
    public static void main(String[] args) {
        int[] arr = {2,3,3,7,7,7,8};
        int result = FirstIndex(arr,7);
        System.out.println(result);
    }

    static int FirstIndex(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int result = -1;

        while(s<=e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                result = mid;   // Store potential answer
                e = mid - 1;    // Try to find earlier occurrence
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }
}
