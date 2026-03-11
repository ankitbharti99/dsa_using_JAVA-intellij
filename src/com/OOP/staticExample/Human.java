package com.OOP.staticExample;

public class Human {
    String name;
    int age;
    float height;
    long salary;
    static long population;

    static void message() {
        System.out.println("Helloo guys!!!");
//        System.out.println(this.name);    //can't use this keyword over there, as this keyword requires an object but in this situation it is an static method.
    }

    Human(String name, int age, float height, long salary) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.salary = salary;
        Human.population += 1;
    }
}
