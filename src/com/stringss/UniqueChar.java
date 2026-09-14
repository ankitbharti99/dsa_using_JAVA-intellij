package com.stringss;

public class UniqueChar {
    static void main() {
        String str = "Programming";
        System.out.println(isUnique(str));
    }

    static boolean isUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }
}
