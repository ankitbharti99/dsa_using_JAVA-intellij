package com.OOP.interfaces.entendsdemo2;

public class Main implements A, B {
//Not showing error because
//If an interface(A) provides a default method, then a class(Main) implementing that interface is not required to override it.

// But when a class implements multiple interfaces that have the same default method it gives an error to resolve that...
    @Override
    public void greet() {

    }

//...    A.super.fun(); is a special Java syntax used to call the default method of a specific interface.
    @Override
    public void fun() {
        A.super.fun();
    }
//    Usecase of providing body to interfaces using default: Adding new functionality without breaking existing code
    /*
             Suppose thousands of classes implement an interface.
             Now imagine you want to add a new method.
             Now every class implementing Animal breaks.
             This could affect millions of lines of code.
             Now all existing classes continue to work without any changes.
     */


    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
