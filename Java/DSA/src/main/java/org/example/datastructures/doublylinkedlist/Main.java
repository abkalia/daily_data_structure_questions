package org.example.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList myDoublyLinkedList = new DoubleLinkedList(1);
        myDoublyLinkedList.append(6);
        myDoublyLinkedList.append(7);
        myDoublyLinkedList.append(8);
        myDoublyLinkedList.prepend(2);
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.insert(1,4);
        myDoublyLinkedList.printList();
        System.out.println("\nremoved : " + myDoublyLinkedList.remove(2).value);
        myDoublyLinkedList.printList();
    }
}
