package lect_30;

class tortoise {
    Node head; // List ka head pointer

    // Node class ka structure
    class Node {
        int data;
        Node next;
        
        Node(int d) { 
            data = d; 
            next = null; 
        }
    }

    // 1. Middle node dhundna
    void findMiddle() {
        if (head == null) {
            System.out.println("Linked List khali (empty) hai.");
            return;
        }
        
        Node slow = head; 
        Node fast = head; 
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;  
        }
        
        System.out.println("Middle element: " + slow.data);
    }

    // 2. Cycle detect karna
    boolean hasCycle() 
    {
        if (head == null) {
            return false; 
        }
        
        Node slow = head; 
        Node fast = head; 
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;  
            
            if (slow == fast) {     
                return true;
            }
        }
        
        return false; 
    }

    // N-th Node From End (Peeche se N-th element dhundna)
    void nthloop(int n) {
        if (head == null || n <= 0) {
            System.out.println("List khali hai ya invalid 'n' hai.");
            return;
        }

        Node first = head;
        Node second = head;

        // First pointer ko 'n' kadam aage badhao
        for (int i = 0; i < n; i++) {
            if (first == null) { // Agar 'n' list ki size se bada hai
                System.out.println(n + "th element peche se nahi mil sakta: List choti hai.");
                return;
            }
            first = first.next;
        }

        // Ab dono pointers ko tab tak badhao jab tak 'first' null na ho jaye
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        System.out.println("Peeche se " + n + "th element hai: " + second.data);
    }

    // 3. Cycle ka starting node dhundna
    void findCycleStart() {
        if (head == null) {
            System.out.println("Linked List khali hai, koi cycle nahi hai.");
            return;
        }

        Node slow = head;
        Node fast = head;
        boolean isCyclePresent = false;

        // STEP 1: Pehle check karo ki cycle hai ya nahi
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCyclePresent = true; 
                break; 
            }
        }

        // Agar loop bina takraye khatam hua, matlab cycle nahi hai
        if (!isCyclePresent) {
            System.out.println("List mein koi cycle/loop nahi hai.");
            return;
        }

        // STEP 2: Slow pointer ko wapas head par le jao
        slow = head;

        // STEP 3: Ab dono ko 1-1 kadam aage badhao
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next; 
        }

        System.out.println("Cycle ka starting node hai: " + slow.data);
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList1 {
    public static void main(String[] args) {
        tortoise list = new tortoise();
        
        // Linked List banate hain: 1 -> 2 -> 3 -> 4 -> 5 -> null
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);
        
        System.out.println("--- Cycle Banane Se Pehle ---");
        list.display();
        
        // Middle node dhundna
        list.findMiddle(); // Output: Middle element: 3
        
        // Nth element from end (Cycle banane se pehle chalana zaroori hai!)
        list.nthloop(2); // Output: Peeche se 2nd element: 4 (Kyunki list 1->2->3->4->5 hai)
        list.nthloop(5); // Output: Peeche se 5th element: 1
        list.nthloop(6); // Output: 6th element peche se nahi mil sakta: List choti hai.
        
        // Cycle detect karna (Abhi tak cycle nahi bani)
        System.out.println("Cycle present? " + list.hasCycle()); // Output: false
        
        System.out.println("\n--- Ab Cycle Banate Hain (5 -> 3) ---");
        // Ab ek cycle banate hain: 5 ka next seedhe 3 par point karega
        list.head.next.next.next.next.next = list.head.next.next; 
        
        // Cycle detect karna
        System.out.println("Cycle present? " + list.hasCycle()); // Output: true
        
        // Cycle ka starting node dhundna
        list.findCycleStart(); // Output: Cycle ka starting node hai: 3
    }
}


// Tortoise and Hare Algorithm (Floyd’s Cycle Detection Algorithm) ke baare mein samajhne ke liye, yeh code ek linked list banata hai, usme kuch nodes add karta hai, aur phir cycle banata hai. Uske baad, woh cycle detect karta hai aur cycle ke starting node ko bhi dhundta hai. Is algorithm ka main idea yeh hai ki agar ek cycle exist karti hai, toh slow pointer (tortoise) aur fast pointer (hare) ek point par milenge. Jab woh milte hain, tab hum slow pointer ko head par le jaate hain aur dono pointers ko ek-ek step aage badhate hain, jab tak woh fir se nahi milte. Jahan woh milte hain, wahi cycle ka starting node hota hai.