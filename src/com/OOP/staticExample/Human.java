package com.OOP.staticExample;

public class Human {
    String name;
    int age;
    float height;
    long salary;
    static long population;

    Human(String name, int age, float height, long salary) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.salary = salary;
        Human.population += 1;
    }
}
