package com.Recursion.Sortings;

public class SelectionSort {
    static void main() {
        int[] arr = {2,1,4,5,2,3};
        SelSort(arr,arr.length,0, 0);
    }

    static void SelSort(int[] arr, int r, int c, int maxI) {
        if(r==0) {
            for(int i : arr){
                System.out.print(i + " ");
            }
            return;
        }


        if(c<r) {
            if(arr[c] > arr[maxI]) {
                SelSort(arr,r,c+1,c);
            } else {
                SelSort(arr,r,c+1,maxI);
            }
        } else {
            int temp = arr[maxI];
            arr[maxI] = arr[r-1];
            arr[r-1] = temp;
            SelSort(arr,r-1,0, 0);
        }
    }
}
