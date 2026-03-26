package com.Recursion.Array;

public class SortedorNot {
    static void main() {
        int []arr = {1,3,4,7,9};
        System.out.println(sorted(arr,0,1));
    }

    static boolean sorted(int[] arr, int p1, int p2) {
        if(p2 == arr.length-1){
            return true;
        }
        if(arr[p1] < arr[p2]) {
            return sorted(arr, ++p1, ++p2);
        }
        return false;
    }
}
