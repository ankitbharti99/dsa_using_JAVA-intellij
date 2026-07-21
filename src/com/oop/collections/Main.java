package com.oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    static void main() {

        // List is an interface.
        // It extends the Collection interface, so it inherits methods like
        // add(), remove(), size(), clear(), etc.

        // ArrayList is a class that implements the List interface.
        // Therefore, it provides implementations for all the methods
        // declared in List (and inherited from Collection).
        List<Integer> list1 = new ArrayList<>();

        // LinkedList is another class that implements the List interface.
        // Since both ArrayList and LinkedList implement List,
        // they support the same methods.
        List<Integer> list2 = new LinkedList<>();

        // add() is available because it is declared in Collection
        // and inherited by the List interface.
        list1.add(5);
        list2.add(45);

        // These methods work on both objects because both classes
        // implement the same List interface.
        // list1.remove(0);
        // list2.remove(0);
        // list1.size();
        // list2.size();
        // list1.clear();
        // list2.clear();
    }
}