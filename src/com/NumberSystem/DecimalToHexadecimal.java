package com.NumberSystem;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int num = 1997;
        System.out.println(convert(num));
    }

    static StringBuilder convert(int n) {
//        String ans = "";
        String AllChar = "0123456789ABCDEF";
        StringBuilder ans = new StringBuilder();

        while(n>0) {
            int rem = n%16;
//            ans = AllChar.charAt(rem) + ans;
            ans.append(AllChar.charAt(rem));
            n /=16;
        }
        return ans.reverse();
    }
}
