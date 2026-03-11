package com.OOP.staticExample;

public class StaticBlock {
    static int a = 10;
    static int b;

    static {
        System.out.println("Now I am inilizating static variable");
        b = a * 5;
    }

    static void main() {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + obj.b);
//        A static variable belongs to the class, not to the object.
//          So there is only one copy of a and b for the whole class.
//          That means they can be accessed in two ways:
//          Using object name and class name

        obj.b += 5;
        System.out.println(StaticBlock.a + " " + obj.b);

//static method only run once not matter how many new object we create
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + obj2.b);    // It will not print--> Now I am inilizating static variable or perform--> b = a * 5;
    }
}
