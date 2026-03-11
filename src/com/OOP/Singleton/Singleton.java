package com.OOP.Singleton;

public class Singleton {
    private Singleton() {}        //private constructor

    private static Singleton instance;          //variable of the object(or reference variable which stores add of the object)

    public static Singleton getInstance() {       //checks if there is any object already created, if not than create one and return
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    static void main() {
        Singleton s1 = Singleton.getInstance();        //no need to use new keyword otherwise
        Singleton s2 = Singleton.getInstance();       // we cannot access getInstance method as it is private
        System.out.println(s1 == s2);     //will print true as both variable points to the same object
    }
}
