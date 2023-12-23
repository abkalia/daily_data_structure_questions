package org.example.datastructures.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast(){
        if(length ==0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length ==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length ==0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index >= length || index < 0){
            return null;
        }
        int counter = 0;
        Node temp = head;
        while(counter!=index){
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    public Boolean set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public Boolean insert(int index, int value){
        if(index > length || index < 0){
            return false;
        }
        if(index ==0){
            prepend(value);
            return true;
        } else if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next= temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        Node temp = get(index);
        if(get(index) == null){
            return null;
        }
        if(index ==0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }
        Node prev = get(index-1);
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        if(length ==0){
            System.out.println("Empty");
        } else if(length ==1){
            System.out.println("Has Only One entity");
        } else{
            Node temp = head;
            head = tail;
            tail = temp;
            Node before = null;
            while(temp!= null){
                Node after = temp.next;
                temp.next = before;
                before = temp;
                temp = after;
            }
        }
    }

    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                return true;
            }
        }
        return false;
    }

    public Node findKthFromEnd(int k){
        Node slow = head;
        Node fast = head;
        for(int i =0;i<k;i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        while(fast !=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //Good question
    public void partitionList(int x){
        if(head == null) {
            return;
        }
        Node dummy1 = new Node(1);
        Node dummy2 = new Node(1);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;
        while(current!= null){
            if(current.value > x){
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }

    //reverse between
    public void reverseBetween (int m, int n) {
        if(m<0 || n>=length || m>n || m==n){
            return;
        }
        Node temp = head;
        Node before = null;
        Node startBefore = null;
        Node potentialEndNode = head;
        for(int i=0;i<=n;i++){
            if( i == m-1){
                startBefore = temp;
                potentialEndNode = temp.next;
            }
            if(i >=m && i<=n){
                Node after = temp.next;
                temp.next = before;
                before = temp;
                temp = after;
            } else {
                temp = temp.next;
            }
        }
        if(startBefore == null){
            head = before;
        } else {
            startBefore.next = before;
        }
        potentialEndNode.next = temp;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }
    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("\nLength: " + length);
    }

}
