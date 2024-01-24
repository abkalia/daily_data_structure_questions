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

    /** delete-the-middle-node-of-a-linked-list
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            ListNode slowPrev = head;
            while(fast != null && fast.next != null){
                slowPrev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            if(slow != head){
                slowPrev.next = slow.next;
                slow.next = null;
            } else {
                return null;
            }
            return head;
        }
    }


     https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     class Solution {
     public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode start = head;
     ListNode startPrev = null;
     ListNode runner = head;
     int counter = 0;
     if(runner.next == null && n == 1){
     return null;
     }
     while(runner != null){
     if(counter < n){
     counter++;
     runner = runner.next;
     } else {
     startPrev = start;
     start = start.next;
     runner = runner.next;
     }
     }
     if(startPrev != null){
     startPrev.next = start.next;
     start.next = null;
     } else {
     head = start.next;
     }

     return head;
     }
     }
    **/
}
