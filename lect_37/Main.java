// How the Logic Works Step-by-Step-
//1) Reversing Inputs: * 2 -> 4 -> 3 becomes 3 -> 4 -> 2 (representing 342)
//                     * 3 -> 5 -> 6 becomes 6 -> 5 -> 3 (representing 653)
//2) Summing nodes:Node 1: 3 + 6 = 9 (carry 0) -> Result: 9
//                :Node 2: 4 + 5 = 9 (carry 0) -> Result: 9 -> 9
//                :Node 3: 2 + 3 = 5 (carry 0) -> Result: 9 -> 9 -> 5
//3) Final Reverse: Reversing 9 -> 9 -> 5 keeps it as 9 -> 9 -> 5, matching your desired final format.

package lect_37;


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
        this.next = null;
    }
}

 class Main {

    // Helper function to reverse a linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to add two linked lists after reversing them
    public static ListNode addTwoLists(ListNode l1, ListNode l2) {
        // Step 1: Reverse both input lists to line up least significant digits
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        
        // Step 2: Add the digits along with any carryover
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        
        // Step 3: Reverse the accumulated sum list to match expected output format
        return reverseList(dummyHead.next);
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating list1: 2 -> 4 -> 3
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        // Creating list2: 3 -> 5 -> 6
        ListNode list2 = new ListNode(3);
        list2.next = new ListNode(5);
        list2.next.next = new ListNode(6);

        System.out.print("Input List 1: ");
        printList(list1);
        System.out.print("Input List 2: ");
        printList(list2);

        // Process and get the final result
        ListNode result = addTwoLists(list1, list2);

        System.out.print("Result List: ");
        printList(result); // Output: 9 -> 9 -> 5
    }
}

