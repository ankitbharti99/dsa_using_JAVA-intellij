package com.OOP.abstractDemo;

public class Main {
    static void main() {
        Son son = new Son("Adult");
        son.naam("Rohit");
        son.about("B-tech", 4);

        Daughter daughter = new Daughter("Teenage");
        daughter.naam("Sanjana");
        daughter.about("MBBS", 5);

        //We cannot create an object of an abstract class, but we can create a reference of the
        //abstract parent class and use it to refer to an object of its child class.
        Parent daughter2 = new Daughter("Child");
    }
}
