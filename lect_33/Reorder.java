// Reorder List ya Zig-Zag Rearrangement

package lect_33;

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

    // Main Function: Jo list ko first-last-second-secondlast pattern me arrange karega
    public void reorderList() {
        if (head == null || head.next == null) return;

        // Step 1: Tortoise method se middle tak pahuncho
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Middle ke baad wali aadhi list ko reverse karo
        Node head2 = reverse(slow.next);
        slow.next = null; // Pehli list ko beech se tod diya

        // Step 3: Dono lists ko ek-ek karke merge (interleave) karo
        Node head1 = head;
        while (head1 != null && head2 != null) {
            Node temp1 = head1.next; // Pehli list ke agle node ka backup
            Node temp2 = head2.next; // Doosri list ke agle node ka backup

            // Links ko zig-zag joda
            head1.next = head2; 
            head2.next = temp1;

            // Pointers ko aage badhayein
            head1 = temp1;
            head2 = temp2;
        }
    }

    // Helper Method: List ko ulatne ke liye
    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Data insert karne ke liye
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
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Reorder {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // List banate hain: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.println("Original List:");
        list.display();

        list.reorderList();

        System.out.println("Rearranged List (First, Last, Second, Second-Last...):");
        list.display();
    }
}

