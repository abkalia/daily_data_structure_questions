package org.example.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList myDoublyLinkedList = new DoubleLinkedList(1);
        myDoublyLinkedList.append(6);
        myDoublyLinkedList.append(7);
        myDoublyLinkedList.append(8);
        myDoublyLinkedList.prepend(2);
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.printList();
        System.out.println("\nGET IS : " + myDoublyLinkedList.get(1).value);
    }
}
