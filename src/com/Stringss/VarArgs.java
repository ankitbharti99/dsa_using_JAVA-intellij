package com.Stringss;

import java.util.Arrays;


public class VarArgs {
    public static void main(String[] args) {
        print(1,2,5,2,4,7,2,4,7,3,90,32,0,1);

        print("Hello", "Ankit", "How", "Are", "You");

    }

    static void print(int ...anyNumOf) {
        System.out.println(Arrays.toString(anyNumOf));
    }

    static void print(String ...anyNumOf) {
        System.out.println(Arrays.toString(anyNumOf));
    }
}
