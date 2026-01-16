package com.ankit;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,55,-2,3,-4,5,0,99  };
        reverse(arr);
    }

    static void reverse(int[] array) {
        int s = 0;
        int e = array.length-1;

        while(s<e) {
            int temp = array[s];
            array[s] = array[e];
            array[e] = temp;
            s++;
            e--;
        }

        for(int i=0;i< array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
