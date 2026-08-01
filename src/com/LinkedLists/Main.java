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

        try {
            list.insertAtPosition(11, -5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        list.display();

        list.deleteAtFirst();
        list.display();

        list.deleteAtLast();
        list.display();


        try {
            list.deleteAtPosition(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        list.display();

        System.out.println("SIZE = " + list.getSize());

        System.out.println(list.get(3));
        System.out.println(list.findNode(26));;
    }
}
