package com.BinarySLeetcodeQ;
//Find First and Last Position of Element in Sorted Array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstAndLastPosition34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] result = Position(arr,8);
        System.out.println(result[0] + " " + result[1]);
    }

    static int[] Position(int[] arr, int target) {
        int[] result = {-1,-1};
        int s = 0;
        int e = arr.length-1;
        int first = -1;
        int second = -1;
        if(arr.length == 0) {
            return result;
        }
        
        while(s<=e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                first = mid;   // Store potential answer
                e = mid - 1;    // Try to find earlier occurrence
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        s = 0;
        e = arr.length-1;
        while(s<=e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                second = mid;   // Store potential answer
                s = mid + 1;    // Try to find earlier occurrence
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

            result[0] = first;
            result[1] = second;
        return result;
    }
}
