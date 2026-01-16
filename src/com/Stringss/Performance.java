package com.Stringss;

public class Performance {
    public static void main(String[] args) {
        String albhabet = "";

        for(int i=0;i<26;i++) {
            char ch = (char) ('A' + i);
            albhabet += ch;
        }
        System.out.println(albhabet);

        //This above program has a problem.
        // As we know string is immutable. So it is creating a new object every time. a,ab,abc,...,abcd...yz.
        // to solve this problem we have to use StringBuilder
    }
}
