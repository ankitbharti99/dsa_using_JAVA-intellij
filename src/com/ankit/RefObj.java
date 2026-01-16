package com.ankit;

import java.util.Arrays;

public class RefObj {

    static void changeV(int[] roll) {
        roll[0] = 100;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,9};
        changeV(arr);
        System.out.println(Arrays.toString(arr));

        String name = "Ankit";
        name = "Tony";
        System.out.println(name);
    }
}
