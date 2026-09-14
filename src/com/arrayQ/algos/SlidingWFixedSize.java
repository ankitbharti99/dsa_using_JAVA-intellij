package com.arrayQ.algos;

public class SlidingWFixedSize {
    static void main() {
        int[] arr = {1,2,3,-4,5,6};
        System.out.println(SlidingW(arr,3));
    }

    static int SlidingW(int[] arr, int k) {
        if(arr.length < k) return -1;
        int maxSum;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            int newSum = sum - arr[i-k] + arr[i];
            sum = newSum;
            maxSum = Math.max(newSum,maxSum);
        }
        return maxSum;
    }
}