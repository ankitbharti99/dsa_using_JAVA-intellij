package com.recursion.String;

public class PrintSkippingA {
    public static void main(String[] args) {
        String str = "Ankita";
        System.out.println(skip(str,new StringBuilder(), 0));
    }

    static String skip(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            return ans.toString();
        }
        if(str.charAt(i) != 'a' && str.charAt(i) != 'A') {
            ans.append(str.charAt(i));
        }
        return skip(str,ans,i+1);
    }
}
