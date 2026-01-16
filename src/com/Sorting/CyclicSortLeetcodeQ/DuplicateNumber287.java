package com.Sorting.CyclicSortLeetcodeQ;
//https://leetcode.com/problems/find-the-duplicate-number/description/


public class DuplicateNumber287 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int result = search(arr);
        System.out.println(result);
    }

    static int search(int[] arr) {
        int i=0;
        while(i<arr.length) {
            if (arr[i] != i + 1) {
                int correctIndx = arr[i] - 1;
                if (arr[i] != arr[correctIndx]) {
                    swap(arr, i, correctIndx);
                } else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
