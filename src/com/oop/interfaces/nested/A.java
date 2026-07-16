package com.oop.interfaces.nested;

public class A {
    // nested interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

//  A nested interface can be declared as public, private and protected.
//But the top level inteface has to be declared as public or default one.