package com.OOP.nonstaticExample;

public class Main {

    void method1() {
        System.out.println("Method 1");
        method2();   // calling another non-static method
    }

// Inside a non-static method, Java automatically uses the current object (this).
//    method2() is actually like -->  this.method2();
    void method2() {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        Main obj = new Main();   // object created
        obj.method1();           // start calling
    }
}
