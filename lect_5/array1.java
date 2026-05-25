import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();    
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(10); // Initial capacity of 10

        list1.add(50);
        
        // --- CREATE ---
        list.add(5);     // O(1)
        list.add(10);    // O(1)
        list.add(1, 30); // O(n) -> Requires shifting elements to the right. List is now [5, 30, 10]
        
        list2.add(100);
        list2.add(200);

        // --- UPDATE ---
        list.set(1, 100); // O(1) -> Directly replaces index 1. List is now [5, 100, 10]

        // --- BULK ADD ---
        list.addAll(list1);   // O(m) where m is size of list1
        list.addAll(list2);   // List becomes: [5, 100, 10, 50, 100, 200]

        // --- DELETE ---
        list.remove(0); // O(n) -> Shifts everything left. List is now [100, 10, 50, 100, 200]
        list.remove(Integer.valueOf(30)); // O(n) -> Searches for 30 (not found, list stays same)

        // --- SEARCH ---
        boolean exists = list.contains(100);   // O(n)
        int idx1 = list.indexOf(100);         // O(n) -> Returns 0
        int idx2 = list.lastIndexOf(100);     // O(n) -> Returns 3

        // --- UTILS ---
        int size = list.size();          // O(1)
        boolean isEmpty = list.isEmpty(); // O(1)

        // --- READ OUT ---
        System.out.println("Final List: " + list);
        
        // Defensive check to avoid IndexOutOfBoundsException
        if (list.size() > 1) {
            System.out.println("Element at index 1: " + list.get(1)); // O(1)
        } else {
            System.out.println("List is too short to read index 1!");
        }
    }
}
