package com.LinkedLists.doubly;

public class Main {
    static void main() {
        DoublyLL list = new DoublyLL();
        list.insertAtFirst(12);
        list.insertAtFirst(7);
        list.insertAtFirst(5);
        list.displayForward();
        System.out.println(list.getSize());

        list.insertAtLast(23);
        list.insertAtLast(10);
        list.insertAtLast(41);
        list.displayForward();
        list.displayReverse();

        list.insertAtPosition(55,5);
        list.displayForward();

        list.deleteAtFirst();
        list.displayForward();

        list.deleteAtLast();
        list.displayForward();

        list.deleteAtPosition(3);
        list.displayForward();
    }
}
