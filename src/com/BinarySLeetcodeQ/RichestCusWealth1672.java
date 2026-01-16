package com.BinarySLeetcodeQ;

public class RichestCusWealth1672 {
    public static void main(String[] args) {
        int[][] accounts1 = {
                {1,2,3},
                {3,2,1}
        };
        int[][] accounts2 = {
                {1,5},
                {7,3},
                {3,5}
        };

        int maxWealth = MaxWealth(accounts2);
        System.out.println(maxWealth);
    }

    static int MaxWealth(int[][] accs) {
        int maxW = Integer.MIN_VALUE;
        for(int[] person: accs) {
            int sum = 0;
            for(int acc: person) {
                sum += acc;
            }
            if(sum > maxW) {
                maxW = sum;
            }
        }
        return maxW;
    }
}
