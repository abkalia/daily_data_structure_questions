package org.example.datastructures.microsoft;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args){
        /*
        id 	start_date 	end_date
        ------------------------- -------
        1	10-03-2024 	15-03-2024       
        2	10-03-2024	16-03-2024       
        3	11-03-2024	15-03-2024       
        4   12-03-2024	14-03-2024       
        5   09-03-2024  14-03-2024       
        6   17-03-2024	20-09-2024       
                                         
                                         
                                         
        final mergeDlist                 
                                         
        id 	start_date 	end_date         
        ------------------------- -------
        1	09-03-2024 	16-03-2024       
        3   17-03-2024	20-09-2024       


         */
        Item emp1 = new Item(LocalDate.of(2024,3,10),LocalDate.of(2024,3,15),1);
        Item emp2 = new Item(LocalDate.of(2024,3,10),LocalDate.of(2024,3,16),2);
        Item emp3 = new Item(LocalDate.of(2024,3,11),LocalDate.of(2024,3,15),3);
        Item emp4 = new Item(LocalDate.of(2024,3,12),LocalDate.of(2024,3,14),4);
        Item emp5 = new Item(LocalDate.of(2024,3,9),LocalDate.of(2024,3,14),5);
        Item emp6 = new Item(LocalDate.of(2024,3,17),LocalDate.of(2024,9,20),6);
        List<Item> myList = new ArrayList<>();
        List<Item> merged = new ArrayList<>();
        myList.add(emp1);
        myList.add(emp2);
        myList.add(emp3);
        myList.add(emp4);
        myList.add(emp5);
        myList.add(emp6);
        Comparator<Item> com = (o1, o2) -> {
            if(o1.startDate.isAfter(o2.startDate)){
                return 1;
            } else {
                return -1;
            }
        };
        for(Item em: myList){
            System.out.println(em.id);
        }
        myList.sort(com);
        Item prev = myList.get(0);
        for(int i=1;i<myList.size();i++){
            Item curr = myList.get(i);
            if(curr.startDate.isBefore(prev.endDate) || curr.startDate.isEqual(prev.endDate)){
                prev.endDate = curr.endDate.isAfter(prev.endDate) ? curr.endDate : prev.endDate;
            } else {
                merged.add(prev);
                prev = curr;
            }
        }
        merged.add(prev);
        for(Item em: merged){
            System.out.println(em.id + "||" + em.startDate + "||" + em.endDate);
        }
    }
}

class Item {
    int id;
    LocalDate startDate;
    LocalDate endDate;

    public Item(LocalDate startDate,LocalDate endDate,int id){
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
    }
}