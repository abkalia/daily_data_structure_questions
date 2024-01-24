package org.example.datastructures.hashtable;

public class Main {
    public static void main(String[] args){
        String str = "dabcdabcdabccba";
        String subStr = "abc";

        int count = countSubstrings(str, subStr);
        System.out.println("Number of occurrences: " + count);
    }

    public static int countSubstrings(String str, String subStr) {
        int count = 0;
        int index = 0;

        System.out.println("Index: " + index);
        while ((index = str.indexOf(subStr, index)) != -1) {
            System.out.println("Index: " + index);
            count++;
            index += subStr.length();
        }

        return count;
    }
}
