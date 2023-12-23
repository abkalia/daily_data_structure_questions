package org.example.datastructures.doublylinkedlist;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }

    public DoubleLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast(){
        if(length ==0){
            return null;
        }
        Node temp = tail;
        if(length ==1){
            head = null;
            tail = null;

        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(head == null){
            return null;
        }
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index >= length || index < 0) {
            return null;
        }
        int counter = 0;
        Node temp;
        if (index >= length/2) {
            counter = length - 1;
            temp = tail;
            while (counter != index) {
                temp = temp.prev;
                counter--;
            }
        } else {
            temp = head;
            while (counter != index) {
                temp = temp.next;
                counter++;
            }
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);;
    }
    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("\nLength: " + length);
    }
}
