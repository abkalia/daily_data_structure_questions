package org.example.datastructures.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.reverseBetween(0,4);
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
