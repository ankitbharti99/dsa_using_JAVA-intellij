package com.BinarySLeetcodeQ;
//Find no. of evn digits
// e.g-> {12,333,5678,201} => Ans = 2    => Reason = 12 NumofD = 2, 5678 NumoD = 4. So Ans = 2.
public class NumofEvn1295 {
    public static void main(String[] args) {
        int[] arr = {12,333,5678,201,90,671111};
        int result = NumofD(arr);
        System.out.println(result);
    }

//    static int NumofD(int[] nums) {
//        int digits =0;
//        for(int num: nums) {
//            int count = 0;
//            while(num>0) {
//                num = num/10;
//                count++;
//            }
//            if(count%2 == 0) {
//                digits++;
//            }
//        }
//        return digits;
//    }
                         //OR//
        static int NumofD(int[] nums) {
        int digits = 0;
        for (int num : nums) {
        // Count digits using log10
        int count = (int) Math.log10(num) + 1;
        if (count % 2 == 0) {
            digits++;
        }
    }
    return digits;
    }
}
