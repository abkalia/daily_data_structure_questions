package org.example.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int val){
            this.value = val;
            this.next = null;
        }
    }

    LinkedList(int val){
        Node newNode = new Node(val);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }
}
