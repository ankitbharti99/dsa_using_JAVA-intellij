package com.oop.interfaces.entendsdemo2;

public interface A {
    default void fun() {
        System.out.println("I am a Default in A");
    }

    static void greeting() {
        System.out.println("Hey I am static method");
    }
}
