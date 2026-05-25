class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
     
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node findLastNode() {
        if (head == null) return null;
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }
   
    // Corrected deleteFirst method
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }
        head = head.next;
    }
    
    // Complete display method
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        // Insert elements
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        
        // System.out.println("Original list:");
        // list.display(); // Output: 30 -> 20 -> 10 -> null
        
       // Test deleteFirst
        System.out.println("\nAfter deleting first element:");
        list.deleteFirst();
        list.display(); // Output: 20 -> 10 -> null
        
        // System.out.println("\nAfter deleting first element again:");
        // list.deleteFirst();
        // list.display(); // Output: 10 -> null
        
        // System.out.println("\nAfter deleting first element again:");
        // list.deleteFirst();
        // list.display(); // Output: null
        
        // System.out.println("\nTrying to delete from empty list:");
        // list.deleteFirst(); // Output: List is empty, nothing to delete
    
    }
}