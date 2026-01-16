package com.NumberSystem;
//Given an array where all elements appear twice except one. print that.

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,1,4,2};
        System.out.println(uncommon(arr));
    }

    static int uncommon(int[] arr) {
        int ans=0;
        for (int i=0;i<arr.length;i++) {
                ans = ans^arr[i];
        }
        return ans;
    }
}
