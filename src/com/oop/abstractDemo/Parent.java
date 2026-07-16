package com.oop.abstractDemo;

public abstract class Parent {

    String ageGroup;

    //We can create constructor of Parent Class and call it through "super" class from the child class
    public Parent(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    abstract void naam(String name);

    abstract void about(String degree, int duration);
}
