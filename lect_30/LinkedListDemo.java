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

    // Method to reverse the Linked List
   void reverse(){
    Node temp = head;  // Head se shuruat karenge list ko traverse karne ke liye
    Node prev = null;  // Yeh pointer aakhiri mein reversed list ka naya head banega
    Node next = null;  // Agle node ka address safe rakhne ke liye temporary variable
    
    while(temp != null){   // Jab tak list ke khatam (null) hone tak loop chalega
        next = temp.next;   // Link todne se pehle agle node ka address 'next' mein save kar lo
        temp.next = prev;   // Current node ke pointer ko ulta karke pichle (prev) node par point kar do
        prev = temp;        // 'prev' pointer ko ek kadam aage badha kar current node par le aao
        temp = next;        // 'temp' pointer ko bhi ek kadam aage badha do (jo 'next' mein save kiya tha)
    }
    
    head = prev; // Poori list reverse hone ke baad, 'prev' ko naya head bana doS
}

// Middle node using slow and fast pointer technique or tortoise and hare algorithm
    void findMiddle() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        
        Node slow = head; // Slow pointer moves one step at a time
        Node fast = head; // Fast pointer moves two steps at a time
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by one
            fast = fast.next.next;  // Move fast by two
        }
        
        // When fast reaches the end, slow will be at the middle
        System.out.println("Middle element: " + slow.data);
    }

    // Cycle detection using Floyd’s Tortoise and Hare Algorithm
    boolean hasCycle() {
        if (head == null) {
            return false; // An empty list cannot have a cycle
        }
        
        Node slow = head; // Slow pointer moves one step at a time
        Node fast = head; // Fast pointer moves two steps at a time
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by one
            fast = fast.next.next;  // Move fast by two
            
            if (slow == fast) {     // If they meet, there is a cycle
                return true;
            }
        }
        
        return false; // If fast reaches the end, there is no cycle
    }

    // Add a linked list in the middle (after a specific node)
    void insertAfter(int key, int data) {
        Node temp = head;
        
        // Traverse the list to find the node with the specified key
        while (temp != null) {
            if (temp.data == key) {
                Node newnode = new Node(data);
                newnode.next = temp.next; // Link new node to the next node
                temp.next = newnode;      // Link current node to the new node
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

        System.out.println("\n--- Testing Reverse Feature ---");
        list.reverse();
        list.display(); // Output: 60 -> 50 -> 40 -> 30 -> 20 -> 10 -> null

        System.out.println("\n--- Testing Insert After Feature ---");
        list.insertAfter(30, 35); // Insert 35 after 30
        list.display(); // Output: 60 -> 50 -> 40 -> 30 -> 35 -> 20 -> 10 -> null

        System.out.println("\n--- Testing Find Middle Feature ---");
        list.findMiddle(); // Output: Middle element: 30
        list.display(); // Output: 60 -> 50 -> 40 -> 30 -> 35 -> 20 -> 10 -> null

    }
}

