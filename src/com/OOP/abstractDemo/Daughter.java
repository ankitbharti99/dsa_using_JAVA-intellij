package com.OOP.abstractDemo;

public class Daughter extends Parent{

    Daughter(String age) {
        super(age);
//        this.ageGroup = age;
        System.out.println("AgeGroup: " + age);
    }

    @Override
    void naam(String name) {
        System.out.println("I am a Daughter, my name is " + name);
    }

    @Override
    void about(String degree, int duration) {
        System.out.println("My degree is " + degree + " duration is " + duration);
    }
}