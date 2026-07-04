package com.OOP.generics.comparingObj;

public class Student implements Comparable<Student>{
    int age;
    float marks;

    public Student(int age, float marks) {
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        //if diff == 0: means both are equal
        //if diff < 1: menas o is bigger else o is smaller
        return diff;
    }
}
