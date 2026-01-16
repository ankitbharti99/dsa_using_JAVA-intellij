package com.NumberSystem;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int num = 1000001;
        System.out.println(convert(num));
    }

    static int convert(int n) {
        int ans = 0, power = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * Math.pow(2, power);
            n /= 10;
            power++;
        }
        return ans;
    }
}
