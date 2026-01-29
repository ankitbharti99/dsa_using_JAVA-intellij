package com.NumberSystem;
//Find XOR of numbers from 0 to a

public class Question11 {
    public static void main(String[] args) {
        int a = 7;
        System.out.println("XOR from 0 to " + a + " is: " + xors(a));
    }

    static int xors(int a) {
        if(a % 4 == 0) return a;
        else if(a % 4 == 1) return 1;
        else if(a % 4 == 2) return a+1;
        else if(a % 4 == 3) return 0;
        return 0;
    }
}
