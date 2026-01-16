package com.Recursion;
/*
Variables you need to pass in the future function calls put inside the argument without thinking twice.
Variable that you don't need to pass inside the future recursion calls. Put it inside the body of that function.
 */
public class BinarySrch {
    public static void main(String[] args) {
        int[] arr = {0,2,3,5,11,22,32,56};
        int target = 22;
        int start = 0;
        int end = arr.length-1;
        int ans = search(arr,target,start,end);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s,int e) {
        if(s>e) return -1;

        int mid = s + (e-s)/2;

        if(target == arr[mid]) return mid;

        if(target > arr[mid]) {
            return search(arr,target,mid+1,e);
        }
        return search(arr,target,s,mid-1);
    }
}
