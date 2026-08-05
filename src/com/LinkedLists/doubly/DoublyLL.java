package com.LinkedLists.doubly;

import com.LinkedLists.singly.LL;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
            next = null;
            prev = null;
        }
    }

    //Insert At Beginning
    public void insertAtFirst(int value) {
        Node node = new Node(value);

        if(head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;

            head = node;
        }
        size++;
    }

    //Insert At Last
    public void insertAtLast(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtPosition(int value, int index) {
        Node newNode = new Node(value);
        Node temp;

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

        if (index < size / 2) {
            temp = head;

            // Moving temp to the node before the insertion position
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
        }
        else {
            temp = tail;

            for (int i = 0; i < size - index; i++) {
                temp = temp.prev;
            }
        }
        // Inserting new node
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    public void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println("END");
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        head = head.next;

        if (head == null) {
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
            deleteAtFirst();
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

    public void deleteAtPosition(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0) {
            deleteAtFirst();
            return;
        }
        if(index == size-1) {
            deleteAtLast();
            return;
        }

        if(index < size/2) {
            Node temp = head;
            for(int i=0; i<index-1; i++) {
                temp = temp.next;
            }
            Node nodeToDelete = temp.next;
            temp.next = nodeToDelete.next;
            nodeToDelete.next.prev = temp;
        } else {
            Node temp = tail;
            for (int i = 0; i < size-index-2; i++) {
                temp = temp.prev;
            }
            Node nodeToDelete = temp.prev;
            temp.prev = nodeToDelete.prev;
            nodeToDelete.prev.next = temp;
        }
        size--;
    }
}