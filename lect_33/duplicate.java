package lect_33;

// 1. Ek Node class banayi jo linked list ka har ek block represent karegi
class Node {
    int data;
    Node next;
    
    Node(int d) { 
        data = d; 
        next = null; 
    }
}

// 2. Ek alag LinkedList class banayi jo saare operations handle karegi
class LinkedList {
    Node head; // Har list ka apna ek head pointer hoga

    // Duplicate nodes ko remove karne ka method
    void removeDuplicates() {
        Node current = head; // Current pointer se list traverse karenge
        
        while (current != null && current.next != null) {
            // Agar current node aur uske agle node ka data same hai
            if (current.data == current.next.data) {
                // Toh beech wale duplicate node ko skip karke sidha uske agle se connect kar do
                current.next = current.next.next; 
            } else {
                // Agar data alag hai, toh current pointer ko aage badhao
                current = current.next;
            }
        }
    }

    // Naya node list ke last me insert karne ka method
    void insert(int data) {
        Node newNode = new Node(data); 
        
        // Agar list khali hai, toh naya node hi head banega
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Aakhiri node tak pahunchne ke liye loop
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; // Last node ke next me naya node jod diya
    }

    // List ko print karne ka method
    void display() {
        Node temp = head; 
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; 
        }
        System.out.println(); 
    }
}

public class duplicate {
    public static void main(String[] args) {
        // 3. duplicate class ka nahi, LinkedList class ka object banayein
        LinkedList list = new LinkedList();
        
        // Linked List data insert kar rahe hain (Sorted Order me)
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(40);
        
        System.out.println("Original List:");
        list.display(); // Output: 10 20 20 30 40 40 
        
        list.removeDuplicates(); // Duplicates delete karega
        
        System.out.println("List after removing duplicates:");
        list.display(); // Output: 10 20 30 40 
    }
}


// Explanation:
// Maan lijiye humari list aisi dikhti hai: 10 -> 20 -> 20 -> 30

//1) Pehle Step Par (current hai 10 par):
// -Check kiya: Kya 10 == 20? Nahi!
// -Toh code else block me gaya aur current aage badh kar pehle 20 par chala gaya.

//2) Doosre Step Par (current hai pehle 20 par):
//-Check kiya: Kya current.data (20) == current.next.data (20)? Haan, dono same hain!
//-Ab magic line chali: current.next = current.next.next;
//-Iska matlab, pehle 20 ka link uske barabar wale 20 se toot kar, seedha 30 se jud gaya.
//-Dhyan dein: Is step par humne current = current.next nahi kiya, kyunki ho sakta hai aage ek aur 20 ho! Hum agali baar fir se usi current node ko naye next se compare karenge.

//3) Tehsre Step Par (current abhi bhi pehle 20 par hai, par uski next value ab 30 hai):
//-Check kiya: Kya 20 == 30? Nahi!
//-Code else me gaya aur current ab 30 par shift ho gaya.
// Kyunki yeh list already sorted thi, isliye saare ek jaise elements ek ke baad ek hi aane the. Is single loop se humne poori list bina kisi extra space (O(1) Space) ke saaf kar di!

