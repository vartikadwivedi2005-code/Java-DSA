package lect_35;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {

    public static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Create dummy nodes to simplify linking
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        // Pointers to track the tails of the three lists
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;

        Node curr = head;

        // Step 1: Separate the nodes into 3 independent lists
        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        // Step 2: Combine the three lists
        // Connect 0s list to 1s list if it exists; otherwise, connect directly to 2s
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        
        // Connect 1s list to 2s list
        one.next = twoDummy.next;
        
        // Crucial: The last node must point to null to avoid cycles
        two.next = null;

        // The new head will be the first actual node after zeroDummy
        return zeroDummy.next;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating the list: 0 -> 1 -> 2 -> 1 -> 0 -> 2
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(2);

        System.out.print("Original List: ");
        printList(head);

        head = sortList(head);

        System.out.print("Sorted List:   ");
        printList(head);
    }
}
