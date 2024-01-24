package org.example.datastructures.stan;

import java.util.ArrayList;
import java.util.HashMap;

public class Compe {

    //Find Itinerary from a given list of tickets
    // uses hashmaps and stringbuilder
    /*
        input
        ArrayList<String> str = new ArrayList<>();
        str.add("Chennai -> Banglore");
        str.add("Bombay -> Delhi");
        str.add("Goa -> Chennai");
        str.add("Delhi -> Goa");
        Compe comp = new Compe();
        System.out.println(comp.listSort(str));
     */
    public String listSort(ArrayList<String> str){
        String startingPoint = "";
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<String,String> straightMapping = new HashMap<>();
        HashMap<String,String> reverseMapping = new HashMap<>();
        for(String entry: str){
            String[] stringSplit = entry.split(" ");
            straightMapping.put(stringSplit[0],stringSplit[2]);
            reverseMapping.put(stringSplit[2],stringSplit[0]);
        }
        for(String iter: straightMapping.keySet()){
            if(reverseMapping.get(iter) == null){
                startingPoint = iter;
                break;
            }
        }
        stringBuilder.append(startingPoint);
        while(straightMapping.get(startingPoint) != null){
            String next = straightMapping.get(startingPoint);
            stringBuilder.append(" -> ");
            stringBuilder.append(next);
            startingPoint = next;
        }
        return stringBuilder.toString();
    }
}
