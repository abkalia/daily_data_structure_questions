package org.example.datastructures.hashtable;

import java.util.*;

public class HashTable {
    private final int size = 7;
    private final Node[] dataMap;

    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i=0;i<keyChars.length;i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue*23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key,value);
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp!=null){
            if(temp.key == key){
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys(){
        ArrayList<String> array = new ArrayList<>();
        for(int i = 0;i<size;i++){
            Node temp = dataMap[i];
            while(temp!= null){
                array.add(temp.key);
                temp = temp.next;
            }
        }
        return array;
    }

    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer,Boolean> hashMap = new HashMap<>();
        for(int i : array1){
            hashMap.put(i,true);
        }
        for(int i : array2){
            if(hashMap.get(i) != null) return true;
        }
        return false;
    }

    public static Character firstNonRepeatingChar(String str){
        char[] charList = str.toCharArray(); //need to check this.
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(char i: charList){
            hashMap.put(i,hashMap.getOrDefault(i,0) +1);
        }
        for(char i:charList){
            if(hashMap.get(i)!=null && hashMap.get(i) == 1){
                return i;
            }
        }
        return null;
    }

    //anagram list
    public static List<List<String>> groupAnagrams(String[] strings){
        HashMap<String,List<String>> anagramGroups = new HashMap<>();
        for(String str: strings){
            char[] charList = str.toCharArray();
            List<String> list1 = new ArrayList<>();
            Arrays.sort(charList);
            String canonical = new String(charList);
            if(anagramGroups.get(canonical)== null){
                list1.add(str);
                anagramGroups.put(canonical,list1);
            } else {
                List<String> list2 = anagramGroups.get(canonical);
                list2.add(str);
                anagramGroups.put(canonical,list2);
            }
        }
        return new ArrayList<>(anagramGroups.values());
    }


    public HashTable(){
        dataMap = new Node[size];
    }
    public void printTable(){
        for(int i=0;i<dataMap.length;i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp !=null){
                System.out.println(" {" + temp.key + "=" + temp.value + "}");
                temp = temp.next;
            }
        }
    }
}
