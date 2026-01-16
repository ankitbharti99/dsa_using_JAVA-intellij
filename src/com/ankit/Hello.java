package com.ankit;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        Scanner value = new Scanner(System.in);
//        System.out.print("Write a number: ");
//        int input = value.nextInt();
//
////        System.out.println(input.charAt(0));
////        System.out.println("Your number is: " + (int)(input));
//        System.out.println("Your number is: " + (byte)(input));

//        byte a = 20;
//        byte b = 30;
//        byte c = (byte)((int)a*b/3);
//        System.out.println(c);

//        Scanner sc = new Scanner(System.in);
//        char character = sc.next().trim().charAt(3);
//        System.out.println(character);

//        Scanner sc = new Scanner(System.in);
//        String vegetable = sc.next();
//
//        switch (vegetable) {
//            case "cucumber" -> System.out.println("It is a fruit + vegetable");
//            case "cabbage" -> System.out.println("It is a kind of multi layered leaf");
//            case "potato" -> System.out.println("King of vegetables");
//            default -> System.out.println("Not a popular vegetable");
//        }

        System.out.println(add());
    }

    static int add() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        return num1+num2;
    }
}
