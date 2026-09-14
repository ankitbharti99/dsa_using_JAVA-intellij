package com.arrayQ;

public class FirstNegInWindow {
    static void main() {
        int[] arr = {-1,1,-3,5,-2,1};
        int[] res = firstNegative(arr,3);

        for (int i=0;i< res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] firstNegative(int[] arr, int k) {

        int[] result = new int[arr.length - k + 1];

        int l = 0;
        int r = 0;
        int index = 0;
        while (r < arr.length) {
            if (r - l + 1 == k) {

                int firstN = 0;
                for (int i = l; i <= r; i++) {
                    if (arr[i] < 0) {
                        firstN = arr[i];
                        break;
                    }
                }
                result[index++] = firstN;
                l++;
            }
            r++;
        }
        return result;
    }
}
