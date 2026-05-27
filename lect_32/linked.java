package lect_32;

// 1. Ek Node class banayi hai jo list ka har ek single element represent karegi
class Node {
    int data;    // Isme value store hogi (jaise 10, 20 etc.)
    Node next;   // Yeh agle node ka address store karega

    Node(int data) {
        this.data = data;
        this.next = null; // Shuruat me agla node khali (null) hoga
    }
}

class LinkedList {
    Node head; // List ka pehla node trace karne ke liye pointer

    // 2. Naya element list ke aakhiri me add karne ke liye insert method
    public void insert(int data) {
        Node newNode = new Node(data); // Naya node banaya
        
        // Agar list khali hai, toh naya node hi head ban jayega
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Agar list me pehle se elements hain, toh aakhiri tak jao
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // Aakhiri node ke 'next' me naya node jod do
        temp.next = newNode;
    }

    // 3. Do sorted lists ko merge (jodne) ka main logic
    Node merge(Node head1, Node head2) {
        // Ek farzi (dummy) node banaya taaki edge cases handle karna aasan ho
        Node dummy = new Node(0); 
        Node tail = dummy; // Yeh pointer naye merged list ko build karega

        // Jab tak dono me se koi bhi ek list khatam nahi ho jaati, tab tak loop chalega
        while (head1 != null && head2 != null) {
            // Jo node chota hoga, usko tail ke aage connect karenge
            if (head1.data <= head2.data) {
                tail.next = head1;      // tail ko head1 se joda
                head1 = head1.next;    // head1 ko ek kadam aage badhaya
            } else {
                tail.next = head2;      // tail ko head2 se joda
                head2 = head2.next;    // head2 ko ek kadam aage badhaya
            }
            tail = tail.next; // tail pointer ko bhi naye node par shift kiya
        }

        // Agar loop ke baad koi ek list bach gayi hai, toh use poora ka poora tail se jod do
        tail.next = (head1 != null) ? head1 : head2;

        // dummy ka next hi humari asli sorted merged list ka head hai
        return dummy.next; 
    }
}

public class linked {
    public static void main(String[] args) {
        // Pehli sorted list banayi: 10 -> 30 -> 50
        LinkedList list1 = new LinkedList();
        list1.insert(10);
        list1.insert(30);
        list1.insert(50);

        // Doosri sorted list banayi: 20 -> 40 -> 60
        LinkedList list2 = new LinkedList();
        list2.insert(20);
        list2.insert(40);
        list2.insert(60);

        // Teesri khali list banayi jisme dono ko merge karke dalenge
        LinkedList result = new LinkedList();
        Node mergedHead = result.merge(list1.head, list2.head);
        result.head = mergedHead; // Result list ka head set kiya
        
        // Poori merged list ko print karne ke liye loop
        Node temp = result.head;
        while (temp != null) {
            System.out.print(temp.data + " "); 
            temp = temp.next; // Agle node par jao
        }
    }
}



// Explanation:
// Yeh code Two Sorted Linked Lists ko Merge karke ek single sorted linked list banane ka kaam karta hai. Iska tarika bilkul simple hai:

// 1)Comparison (Tulna): Hum dono lists ke head pointers (head1 aur head2) ko aamne-saamne rakhte hain aur check karte hain ki kiski value choti hai.

// 2)Dummy Node Ka Use: Humne ek temporary dummy node banaya hai. Jo bhi value choti hoti hai, hum use is dummy node ke aage (tail.next bankar) lagate chale jaate hain.

// 3)Pointers Ko Aage Badhana: * Agar head1 chota tha, toh humne use merge list me lagaya aur head1 ko uski list me ek step aage badha diya (head1 = head1.next).

// 4)tail pointer ko bhi humesha naye jude node par shift karte hain taaki agla element uske aage jud sake.

// 5)Bacha Kucha Data: Jab ek list poori tarah khatam ho jaati hai (yaani null ho jaati hai), toh loop ruk jata hai. Lekin doosri list me abhi bhi kuch bade elements bache ho sakte hain. Kyunki dono lists pehle se sorted thi, hum bachi hui poori list ko bina kisi check ke direct tail.next se jod dete hain.

// Final Output: Kyunki humne shuruat ek dummy node (value 0) se ki thi, isliye asli list dummy.next se shuru hoti hai. Vahi hum return kar dete hain.
