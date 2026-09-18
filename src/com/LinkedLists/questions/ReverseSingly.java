package com.LinkedLists.questions;

public class ReverseSingly {
    static void main() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        display(head);

        head = reverse(head);

        System.out.println("\nReversed List:");
        display(head);
    }

    static class Node {
        int value;
        Node next;

        Node(int data) {
            this.value = data;
            this.next = null;
        }
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current  = head;

        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void display(Node head) {

        while(head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.print("NULL");
    }
}
