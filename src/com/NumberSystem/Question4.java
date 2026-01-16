package com.NumberSystem;
//Every number appears 3 times except for one. Find that number.

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        int ans = findUnique(arr);
        System.out.println(ans);
    }

    static int findUnique(int[] arr) {
        int result = 0;

        // check each bit from 0 to 31
        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }

            // If count % 3 == 1, this bit is set in the unique number
            if (count % 3 == 1) {
                result |= (1 << i);
            }
        }

        return result;
    }
}

