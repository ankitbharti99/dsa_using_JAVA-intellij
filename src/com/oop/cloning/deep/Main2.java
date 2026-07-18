package com.oop.cloning.deep;

import com.oop.cloning.shallow.Human;

import java.util.Arrays;

public class Main2 {
    static void main() throws CloneNotSupportedException{
        Human2 angel = new Human2(25, "Angel Priya");

        Human2 twin = (Human2)angel.clone();
        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;

//        A deep copy creates a completely independent copy of an object, including all the objects it references.

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(angel.arr));

        twin.name = "Kundan Bharti";
        System.out.println(twin.name);
        System.out.println(angel.name);

    }
}