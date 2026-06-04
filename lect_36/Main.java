package lect_36;

// Defining the Node class which was missing
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList { // Fixed typo in class name 'LinkedLIst'
    Node evenoddList(Node head) {
        // Base case: if list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenStart = even; // Save the start of even list to connect later

        // Loop runs until we reach the end of the list
        // Using even != null handles both even and odd length lists safely
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenStart; // Connecting the end of odd list to the start of even list

        return head; 
    }

    void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Creating list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        list.print(head);

        Node modifiedHead = list.evenoddList(head);

        System.out.println("Modified List (Odd followed by Even):");
        list.print(modifiedHead);
    }
}