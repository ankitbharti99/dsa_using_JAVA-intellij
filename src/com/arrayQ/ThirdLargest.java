package com.arrayQ;

public class ThirdLargest {
    static void main() {
        int[] arr = {1,1,1,1,4,1,1,6,-8,3,1};
        int result = Search(arr);
        System.out.println(result);
    }

    static int Search(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        int tlargest = Integer.MIN_VALUE;

        if(arr.length < 3) return -1;

        for (int i=0;i<arr.length;i++) {
            if(arr[i] >= largest) {
                tlargest = slargest;
                slargest = largest;
                largest = arr[i];
            } else if(arr[i] >= slargest && arr[i] < largest) {
                tlargest = slargest;
                slargest = arr[i];
            } else if (arr[i] >= tlargest && arr[i] < slargest) {
                tlargest = arr[i];
            }
        }
        return tlargest;
    }
}
