package com.OOP.interfaces.entendsdemo2;

public interface B {
    void greet();

//    Now both interfaces A and B has same name default methods which will cause error to resolve this
//we have to override it by using the qualified interface name with super, i.e., InterfaceName.super.method(). (showed in Main class)
    default void fun() {
        System.out.println("I am a Default in B");
    }
}
