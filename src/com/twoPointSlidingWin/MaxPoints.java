package com.twoPointSlidingWin;

//Prob statement -There is an array of points, find the maximum points I will be getting from the size of the window given, which will be in consecutive order either from the start or end.

public class MaxPoints {
    static void main() {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        System.out.println(calPoints(arr,k));
    }
    
    static int calPoints(int[] arr, int k) {
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            lSum+=arr[i];
            maxSum = lSum;
        }

        int rIndex = arr.length-1;
        for (int j = k-1; j >=0 ; j--) {
            lSum = lSum - arr[j];
            rSum = rSum + arr[rIndex];
            rIndex = rIndex-1;

            maxSum = Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
}