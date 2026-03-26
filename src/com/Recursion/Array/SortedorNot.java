package com.Recursion.Array;

public class SortedorNot {
    static void main() {
        int []arr = {1,3,4,7,9};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr, int p1) {
        if(arr.length <= 1) return true;

        if(p1 == arr.length-1){
            return true;
        }
        if(arr[p1] < arr[p1+1]) {
            return sorted(arr, p1+1);
        }
        return false;
    }
}
