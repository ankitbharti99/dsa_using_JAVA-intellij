package com.oop.cloning.deep;

public class Human2 implements Cloneable{
    int age;
    String name;
    int[] arr;


    public Human2(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,1,6,9};

    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        Human2 twinMaker = (Human2)super.clone(); // this is actually shallow copy

        // make a deep copy
        twinMaker.arr = new int[twinMaker.arr.length];
        for (int i = 0; i < twinMaker.arr.length; i++) {
            twinMaker.arr[i] = this.arr[i];
        }
        return twinMaker;
    }

}