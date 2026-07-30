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
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            insertAtFirst(value);
            return;
        }

        if (index == size) {
            insertAtLast(value);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++) {
            temp = temp.next;
        }
//        Node node = new Node(value);
//        node.next = temp.next;
        //OR instead to above 2 line just use another constructor.
        Node node = new Node(value,temp.next);
        temp.next = node;

        size++;
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

    public void deleteAtFirst() {
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteAtLast() {
        if(tail == null) {
            System.out.println("LinkList is empty");
            return;
        }

        if(size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node temp = head;
        for(int i=1;i<size-1;i++) {
            temp = temp.next;
        }
            tail = temp;
            tail.next = null;
            size--;
        }

    }