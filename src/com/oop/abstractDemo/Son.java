package com.oop.abstractDemo;

public class Son extends Parent{

    Son(String age) {
        super(age);
//        this.ageGroup = age;
        System.out.println("AgeGroup: " + age);
    }

    @Override
    void naam(String name) {
        System.out.println("I am a Son, my name is " + name);
    }

    @Override
    void about(String degree, int duration) {
        System.out.println("My degree is " + degree + " duration is " + duration);
    }
}
