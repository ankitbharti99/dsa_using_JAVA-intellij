package com.Stringss;
import java.lang.String;

public class Strings {
    public static void main(String[] args) {
//        String p1 = "Ankit";
//        String p2 = "Ankit";          // --> In this case, If same value is already present then no new value will be created.
//        String p3 = "Ankit";          //      just new reference variable is created pointing to the same value.
//        System.out.println(p1==p2);    //true
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//
//        p2 = "Ankesh";
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);


        String person1 = new String("Ankit");
        String person2 = new String("Ankit");     // --> In this case, new reference variable is created with new value.
        System.out.println(person1==person2);             //false
        System.out.println(person1.equals(person2));      //true      //checks only value-- .equals()
    }
}
