package com.Stringss;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder alphabet = new StringBuilder();

        for(int i=0;i<26;i++) {
            char ch = (char) ('A' + i);
            alphabet.append(ch);
        }
        System.out.println(alphabet);

        System.out.println(alphabet.isEmpty());

        //StringBuilder is mutable. So it means the changes are made in original string, just like an array.
    }
}
