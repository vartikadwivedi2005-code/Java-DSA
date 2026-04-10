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
   
    void deleteFirst(){
    if(head==null){
     System.out.println("delete")
    }
    head=head.next;
    }
    
   
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
        
        
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        
        list.display(); // Output: 30 -> 20 -> 10 -> null
    }
}