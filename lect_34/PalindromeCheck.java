package lect_34;

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

    // Main Method: Palindrome check karne ke liye
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // Khali list ya single node hamesha palindrome hota hai
        }

        // Step 1: Tortoise method se middle node dhundo
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Middle ke baad wali list ko reverse karo
        // slow pointer abhi middle par hai, toh hum slow.next se reverse shuru karenge
        Node secondHalfHead = reverseList(slow); 
        Node firstHalfHead = head; // Pehli aadhi list ka head

        // Step 3: Dono halves ko ek-ek karke compare karo
        Node temp = secondHalfHead; // Taaki baad me list vapas theek kar sakein (optional)
        while (temp != null) {
            if (firstHalfHead.data != temp.data) {
                return false; // Agar ek bhi data mismatch hua, toh palindrome nahi hai
            }
            firstHalfHead = firstHalfHead.next;
            temp = temp.next;
        }

        return true; // Agar loop bina kisi dikkat ke khatam hua, toh palindrome hai
    }

    // Helper Method: Linked list ko reverse karne ke liye
    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next; // Agle node ka backup rakha
            current.next = prev; // Link ko ulta ghumaya
            prev = current;      // prev ko ek kadam aage badhaya
            current = next;      // current ko ek kadam aage badhaya
        }
        return prev; // 'prev' ab naye reversed part ka head ban chuka hai
    }

    // Insert method list me data daalne ke liye
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
}

public class PalindromeCheck {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Palindrome List banate hain: 1 -> 2 -> 2 -> 1
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(2);
        list.insert(1);


        if (list.isPalindrome()) {
            System.out.println("Haan, yeh Linked List Palindrome hai!");
        } else {
            System.out.println("Nahi, yeh Linked List Palindrome nahi hai.");
        }
    }
}
