package com.arrayQ;

public class MedianInSorted {
    static void main() {
        int[] arr = {1,2,4,3,3,2};
        System.out.println(Median(arr));
    }

    static float Median(int[] arr) {
        int n = arr.length;
        if(arr.length % 2 != 0) return arr[n/2];
        else {
            return (float)((arr[n/2 - 1]) + (float)(arr[n/2])/2);
        }
    }
}
