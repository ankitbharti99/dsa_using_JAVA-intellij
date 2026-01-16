package com.BinarySLeetcodeQ;
//Find greatest element smaller or equal to the target.
public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18}; //target = 7
        int result = Ceiling(arr,15);
        System.out.println(result);
    }

    static int Ceiling(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        if(target > arr[e]) return arr[e];
        while(s<=e) {
            int mid = s+(e-s)/2;

            if(arr[mid] == target) return arr[mid];


            if (arr[mid] < target) {
                s = mid+1;
            }

            if (arr[mid] > target) {
                e = mid-1;
            }
        }
        return arr[e];
    }
}
