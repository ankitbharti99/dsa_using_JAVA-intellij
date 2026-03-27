package com.Recursion.Array;

public class LinearSearch {
    static void main() {
        int[] arr = {1,54,1,15,832,80,12};
        System.out.println(Search(arr,15,0));
    }

    static int Search(int[] arr, int target, int index) {
        if(index > arr.length-1) return -1;
        else if(arr[index] == target) return index;
        else return Search(arr,target,index+1);
    }
}
