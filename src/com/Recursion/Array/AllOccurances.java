package com.Recursion.Array;

import java.util.ArrayList;

public class AllOccurances {
    static void main() {
        int[] arr = {1,4,1,5,3,7,7,4,1};
        FindAllOccurance(arr,1,0);
        System.out.println(list);

        //2nd way, return Arraylist, no need to declare Arraylist outside and create Arraylist during function call.
        System.out.println(FindAllOccurance2(arr,1,0,new ArrayList<>()));
    }

    //1st method, Arraylist not passed through function
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllOccurance(int[] arr, int target, int index) {
        if(index > arr.length-1)  return;
        else if(arr[index] == target) list.add(index);
        FindAllOccurance(arr,target,index+1);
    }

    // 2nd method
    static ArrayList<Integer> FindAllOccurance2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index > arr.length-1)  return list;
        else if(arr[index] == target) list.add(index);
        return FindAllOccurance2(arr,target,index+1, list);
    }
}
