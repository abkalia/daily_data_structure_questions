package org.example.datastructures.stan;

public class Main {
    public static void main(String[] args){
        String myString = "abcab";
        int middle = myString.length()/2;
        System.out.println("Middle value " + middle);
        System.out.println(myString.substring(0,middle));
        if(myString.length() % 2 == 0){
            System.out.println(myString.substring(middle));
        } else {
            System.out.println(myString.substring(middle+1));
        }
    }
}
