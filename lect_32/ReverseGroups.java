package lect_32;

class Node {
    int data;
    Node next;
    
    Node(int d) { 
        data = d; 
        next = null; 
    }
}

class LinkedList {
    Node head;

    // Main Recursive Function: Jo 3-3 ke groups ko reverse karega
    public Node reverseInGroupsOf3(Node head) {
        // Base Case: Agar list khali hai ya usme nodes hi nahi bache
        if (head == null) {
            return null;
        }

        Node current = head;
        Node next = null;
        Node prev = null;
        
        int count = 0;

        // Step 1: Pehle 3 nodes ko reverse karo
        // (Standard Reverse Logic: current ke next ko prev par point karwana)
        while (current != null && count < 3) {
            next = current.next;  // Agle node ka backup liya
            current.next = prev;  // Link ulta ghumaya
            prev = current;       // prev ko ek kadam aage badhaya
            current = next;       // current ko ek kadam aage badhaya
            count++;
        }

        // Step 2: 'next' ab 4th node par hai. 
        // Bachi hui list ko recursion ko de do, vo wahan se 3-3 reverse karke laayega.
        if (next != null) {
            // Shuruat ka head ab is group ka tail ban chuka hai,
            // toh uske 'next' mein agle group ka reversed head jod do.
            head.next = reverseInGroupsOf3(next);
        }

        // 'prev' ab is 3 ke group ka naya head ban chuka hai
        return prev;
    }

    // List me data insert karne ke liye
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // List print karne ke liye
    public void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class ReverseGroups {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // List banate hain: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        System.out.println("Original List:");
        list.display(list.head);

        // 3-3 ke group me reverse kiya
        Node newHead = list.reverseInGroupsOf3(list.head);

        System.out.println("List after reversing in groups of 3:");
        list.display(newHead);
    }
}
