package com.ankit;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,14,16,18,23,34,67};
        int result = Search(arr,34);
        System.out.println(result);
    }

    static int Search(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;

        for(int i=0;i<arr.length;i++) {
            int mid = s+ (e-s)/2;
            if(arr[s] == target) return s;
            if(arr[mid] == target) return mid;

            if(arr[mid] < target) {
                s = mid+1;
            } else{
                e = mid-1;
            }
        }
        return -1;
    }
}
