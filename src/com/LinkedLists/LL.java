package com.LinkedLists;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertAtLast(int value) {
        if(tail == null) {
            insertAtFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;


        size += 1;
    }

    public void insertAtPosition(int value, int index) {
        if(tail == null) {
            insertAtFirst(value);
            return;
        }

        int pos = index-1;
        Node node = new Node(value);
        node.pos =
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
