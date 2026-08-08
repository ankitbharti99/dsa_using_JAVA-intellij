package com.LinkedLists.circular;

public class CircularLL {
    private class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtLast(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
        size++;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linklist is Empty");
            return;
        }

        Node node = head;

        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        } while (node != head);

        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }
}
