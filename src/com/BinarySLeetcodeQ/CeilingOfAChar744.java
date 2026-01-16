package com.BinarySLeetcodeQ;
//Find smallest element greater to the target.
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/


public class CeilingOfAChar744 {
    public static void main(String[] args) {
//        char[] arr = {'x','x','y','y'};
        char[] arr = {'c','f','j'};
        char result = Ceiling(arr,'c');
        System.out.println(result);
    }

    static char Ceiling(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;

        while(s<=e) {
            int mid = s + (e-s)/2;

//               (
// This will show wrong answer coz this condition gives - The smallest character that is greater than or equal to the target.
//            if(letters[mid]<target) {
//                s=mid+1;
//            }else {
//                e=mid-1;
//            }
// But we required for - The smallest character that is strictly greater than the target
//              so, the downward condition follows.
//               )

            if (target < letters[mid]) {
                e = mid-1;
            } else{
                s = mid+1;
            }
        }
        return letters[s% letters.length];
    }
}
