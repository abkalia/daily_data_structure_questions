package org.example.datastructures.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(3);
        myLinkedList.append(6);
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.reverse();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.remove(2);
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.reverse();
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
