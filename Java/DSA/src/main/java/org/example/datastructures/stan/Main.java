package org.example.datastructures.stan;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Employee emp1 = new Employee("Abhishek","Calia",3);
        Employee emp2 = new Employee("Abhishek","Ralia",7);
        Employee emp3 = new Employee("rajat","Aingh",1);
        List<Employee> myList = new ArrayList<>();
        myList.add(emp1);
        myList.add(emp2);
        myList.add(emp3);
        Comparator<Employee> com = (o1, o2) -> {
            if(o1.lastName.compareTo(o2.lastName) > 0){
                return 1;
            } else {
                return -1;
            }
        };
        for(Employee em: myList){
            System.out.println(em.lastName);
        }
        myList.sort(com);
        System.out.println("\n sorted");
        for(Employee em: myList){
            System.out.println(em.lastName);
        }
    }
}
class Employee{
    int id;
    String firstName;
    String lastName;

    public Employee(String name, String last,int id){
        this.firstName = name;
        this.lastName = last;
        this.id = id;
    }
}