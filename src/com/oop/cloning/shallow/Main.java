package com.oop.cloning.shallow;
/*In Java .lang package there is a interface cloneable.
so we must implement that by the class whose clone we want to create.
*/

import java.util.Arrays;

public class Main {
    static void main() throws CloneNotSupportedException{
    Human angel = new Human(25, "Angel Priya");
//    Human twin = new Human(angel);

//        System.out.println(angel.name);
//        System.out.println(twin.name);

        //Shallow Copy
        Human twin = (Human)angel.clone();
        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;

//        In shallow copy, Primitive types (int, char, boolean, double, etc.) are copied by value.
//Reference types (String, arrays, objects, collections, etc.) have only their references copied.

        System.out.println(Arrays.toString(angel.arr));

    }
}