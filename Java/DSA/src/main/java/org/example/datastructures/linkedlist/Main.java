package org.example.datastructures.linkedlist;

import org.example.datastructures.doublylinkedlist.DoubleLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
//        myLinkedList.getLength();
//        myLinkedList.printList();
        DoubleLinkedList myDoublyLL = new DoubleLinkedList(1);
        myDoublyLL.getHead();
        myDoublyLL.getTail();
        myDoublyLL.printList();
    }
}
