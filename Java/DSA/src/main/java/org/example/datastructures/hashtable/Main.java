package org.example.datastructures.hashtable;

public class Main {
    public static void main(String[] args){
        HashTable myHashTable = new HashTable();
        myHashTable.set("Akshit",9);
        myHashTable.set("Abhishek",3);
        myHashTable.set("Aryan",7);
        myHashTable.set("Raj",2);
        myHashTable.printTable();
        System.out.println("\nKeys are : " + myHashTable.keys());
    }
}
