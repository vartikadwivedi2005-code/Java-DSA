package lect_30;

// 1. Blueprint for a single element (Node)
class Node {
    int data;  // Stores the actual value
    Node next; // Stores the reference/pointer to the next node

    // Constructor initializes the node with data and sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// 2. The Linked List implementation holding all behaviors
class LinkedList {
    Node head; // The starting anchor point of the linked list

    // Method to insert a new node at the very beginning (Head)
    void insertAtFirst(int data) { // Renamed to lower camelCase for standard Java convention
        Node newnode = new Node(data);
        
        // Connect the new node to the current start of the list
        newnode.next = head;
        
        // Make the new node the absolute first node (head)
        head = newnode;
    }

    // Method to add a new node at the very end (Tail) of the list
    void insertAtEnd(int data) { // Renamed from 'insert' to make it descriptive
        Node newnode = new Node(data);

        // If the list is empty, the new node becomes the starting node
        if (head == null) {
            head = newnode;
            return;
        }

        // Create a temporary pointer to travel down the list without losing 'head'
        Node temp = head;
        
        // Loop runs until 'temp' reaches the last node (where next is null)
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the last node's next pointer to our newly created node
        temp.next = newnode;
    }

    // Method to delete the FIRST node of the list
    void deleteFirst() { // Renamed from 'end' because it actually deletes from the start!
        // Edge Case: If the list is empty, there is nothing to delete
        if (head == null) {
            System.out.println("Linked List is empty. Nothing to delete.");
            return;
        }
        
        // Shift head forward by one node, cutting off and removing the old first node
        head = head.next; 
    }

    // Method to look for a specific value in the list
    void search(int key) {
        Node temp = head;
        
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found: " + key);
                return; 
            }
            temp = temp.next;
        }
        
        System.out.println("Element not found: " + key);
    }

    // Method to traverse and print all elements in the list
    void display() {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }
        System.out.println("null"); 
    }
}

// 3. Wrapper class containing the main method to run the program
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        System.out.println("--- Building initial list (Insertion at End) ---");
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.display(); // Output: 20 -> 30 -> 40 -> 50 -> 60 -> null

        System.out.println("\n--- Inserting at the beginning ---");
        list.insertAtFirst(10);
        list.insertAtFirst(5);
        list.display(); // Output: 5 -> 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
        
        System.out.println("\n--- Deleting the first node ---");
        list.deleteFirst(); 
        list.display(); // Output: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
        
        System.out.println("\n--- Testing Search Feature ---");
        list.search(20);  // Output: Element found: 20
        list.search(100); // Output: Element not found: 100
    }
}

