package com.LinkedLists;

public class Main {
    static void main() {
        LL list = new LL();
        list.insertAtFirst(26);
        list.insertAtFirst(6);
        list.insertAtFirst(2);
        list.insertAtFirst(15);
        list.insertAtFirst(35);
        list.display();

        list.insertAtLast(25);
        list.insertAtLast(13);
        list.insertAtLast(5);
        list.display();

        list.insertAtPosition(11,-5);
        list.display();
    }
}
