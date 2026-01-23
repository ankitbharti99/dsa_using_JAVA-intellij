package com.NumberSystem;
//Sum of nth row of Pascal Triangle.
/* Pascal's Triangle
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
 */

public class Question7 {
    static void main() {
        int n = 5;
        int ans = 1 << (n-1);
        System.out.println(ans);
    }
}
