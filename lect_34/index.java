package lect_34;

// Node class definition
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class index {
    
    
    // Fixed: Changed return type from void to Node
    public Node partition(Node head, int x) {
        Node smalldummy = new Node(0);
        Node bigdummy = new Node(0); // This is bigdummy
        
        Node small = smalldummy;
        Node large = bigdummy;       // Fixed: Changed largedummy to bigdummy
        Node current = head;
        
        while (current != null) {
            if (current.data < x) {
                small.next = current;
                small = small.next;
            } else {
                large.next = current;
                large = large.next;
            }
            current = current.next;
        }
        
        large.next = null; // Infinite loop se bachne ke liye end ko null kiya
        small.next = bigdummy.next; // Dono lists ko aapas mein jod diya
        
        return smalldummy.next;
    }

    public void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        index list = new index();
        
        // Creating list: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);
        
        System.out.println("Original List:");
        list.print(head);
        
        int x = 3;
        Node partitionedHead = list.partition(head, x);
        
        System.out.println("Partitioned List around " + x + ":");
        list.print(partitionedHead); 
        // Expected Output: 1 -> 2 -> 2 -> 4 -> 3 -> 5
    }
}