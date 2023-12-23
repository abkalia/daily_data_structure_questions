package org.example.datastructures.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(8);
        myLinkedList.append(9);
        myLinkedList.append(10);
        myLinkedList.append(3);
        myLinkedList.append(6);
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.partitionList(5);
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
