package org.example.datastructures.stan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("Chennai -> Banglore");
        str.add("Bombay -> Delhi");
        str.add("Goa -> Chennai");
        str.add("Delhi -> Goa");
        Compe comp = new Compe();
        System.out.println(comp.listSort(str));
    }
}
