package com.arrayQ.algos;

public class TwoPointer {
    static void main() {
        int[] arr = {-1,2,3,4,5,-1};
        int ans = TwoPointer(arr,4);
        System.out.println(ans);
    }

    static int TwoPointer(int[] arr, int k) {
        int s=0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-k; i++) {
            int sum = 0;
            for (int j = i; j < i+k ; j++) {
                sum+=arr[j];
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
