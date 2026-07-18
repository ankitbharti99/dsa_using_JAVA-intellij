package com.oop.cloning.shallow;

//Cloneable is an interface and mandatory implemented just to tell the JVM that object of this class is to be cloned.
public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,1,6,9};
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();      //Shallow Copy
    }

}
