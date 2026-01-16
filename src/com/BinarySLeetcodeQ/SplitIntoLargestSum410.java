package com.BinarySLeetcodeQ;

public class SplitIntoLargestSum410 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(LargestSum(arr,2));
    }

    static int LargestSum(int[] nums, int k) {
        int s = 0;
        int e = k-1;
        int sum = 0;
        int maxV = Integer.MIN_VALUE;
        while(s<e) {
            for(int i=s;i<=e;i++) {
                sum = sum+nums[i];
            }
            System.out.println(sum);
            if(sum>maxV) {
                maxV = sum;
            }
            s++;
            e = e+k-1;
        }
        return maxV;
    }
}
