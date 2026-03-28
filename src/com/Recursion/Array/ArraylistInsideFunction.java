package com.Recursion.Array;

import java.util.ArrayList;

public class ArraylistInsideFunction {
    static void main() {
        int []arr = {1,4,1,5,3,7,7,4,1};
        System.out.println(FindOccurences(arr,0,1));
    }

    static ArrayList<Integer> FindOccurences(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;

        // this will contain answer for that function call only
        if(arr[index] == target)
            list.add(index);

        ArrayList<Integer> ansFromBelowCalls = FindOccurences(arr,index+1,target);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
