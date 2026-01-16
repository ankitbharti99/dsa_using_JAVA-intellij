package com.BinarySLeetcodeQ;
// Basically we can't use '.length' method.

public class InfiniteSizeArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9,12,16,21,27,30,31,35,42,47,55,78,90};
        int result = Position(arr,78);
        System.out.println(result);
    }

    static int Position(int[] arr, int target) {
        int s=0;
        int e=1;

        while(s<=e) {
            if (target <  arr[e]) {
                int mid = s + (e - s) / 2;

                if (target == arr[mid]) return mid;

                if (arr[mid] < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                s = e;
                e = e + (e - s + 1) * 2;

                /*
                KK's logic
                int temp = e + 1;
                e = e + (e - s + 1) * 2;
                s = temp;

                 */
            }
        }
        return -1;
        }
    }


//        OR         // Kunal Kushwaha's code
/*
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 170;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}

 */