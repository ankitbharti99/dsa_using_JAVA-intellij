package com.OOP.staticExample;

public class Main {
    static void main() {
//        Human ankit = new Human("Ankit Bharti",22,5.75f,87784);
//        Human jayant = new Human("Jayant",21,6.1f,62124);
//        Human priyam = new Human("Priyam",22,4.11f,65254);
//
//        System.out.println(ankit.salary);
//        System.out.println(jayant.height);
//        System.out.println(Human.population);
//        System.out.println(Human.population);


//     we know that something which is not static, belongs to an object.
/*        greetings(); //we can't access non-static data from static data     */

//        fun();

//        Main funn = new Main();
//        funn.fun2();
    }

    static void fun() {           //This is not dependent on objects.     //Doesn't belong to an instance
//        greetings();  //we cannot use this because it requires an instance
//        // but the function we are using it in does not depend on instances.
//
//        //we cannot access non-static stuff without referencing their instances
//        // in a static context
//
//        //Hence, here I am referencing it.
//        Main obj = new Main();
//        obj.greetings();
    }

    void greetings() {               //This is dependent on objects.         //Belongs to an instance
        System.out.println("Hello World");
    }

    void fun2() {
        greetings();
    }
}
