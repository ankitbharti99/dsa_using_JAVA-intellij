package com.stringss;
import java.util.Scanner;

public class MinWinSubstring {
    static void main() {
        String str = "TimeToPractice";
        Scanner sc = new Scanner(System.in);
        String srch = sc.next();

        String res = Search(str, srch);
        System.out.println(res);
    }

    static String Search(String str, String srch) {
        char sCh = srch.charAt(0);
        char eCh = srch.charAt(srch.length() - 1);

        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == sCh) {
                while (i < str.length() && str.charAt(i) != eCh) {
                    temp += str.charAt(i);
                    i++;
                }
            }
        }
        temp += eCh;
        return temp;
    }
}
