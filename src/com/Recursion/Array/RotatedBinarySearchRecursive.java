package com.Recursion.Array;

public class RotatedBinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 11, 1, 2, 3};
        int target = 11;

        int result = search(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }


    static int search(int[] arr, int target, int start, int end) {

        // Base case
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        // Found target
        if (arr[mid] == target) return mid;

        // Left half is sorted
        if (arr[start] <= arr[mid]) {

            // Target lies in left
            if (target >= arr[start] && target < arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }

        // Right half is sorted
        else {

            // Target lies in right
            if (target > arr[mid] && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            } else {
                return search(arr, target, start, mid - 1);
            }
        }
    }
}