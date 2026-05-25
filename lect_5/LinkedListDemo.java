import java.util.LinkedList; // Import the official Java LinkedList

public class LinkedListDemo { // Renamed the class to avoid confusing the compiler
    public static void main(String[] args) {
        // Create the official Java LinkedLists
        LinkedList<Integer> list = new LinkedList<>();    // CRUD - Create, Read, Update, Delete
        LinkedList<Integer> list1 = new LinkedList<>();
        
        list1.add(50);
        
        // --- CREATE (Adding elements) ---
        list.add(5);   // Adds to the end -> O(1)
        list.add(10);  // Adds to the end -> O(1)
        list.add(1);   // Adds to the end -> O(1) Note: standard add is O(1), not O(n)

        // --- UPDATE ---
        list.set(1, 100); // Replaces index 1 (10) with 100 -> O(n) to find, O(1) to switch 
        
        // --- ADDING ANOTHER COLLECTION ---
        list.addAll(list1);   // Use addAll() to merge another list into this one
        
        // --- INSERT AT SPECIFIC INDEX ---
        list.add(0, 20); // Inserts 20 at the front -> O(1) for head insertion
        
        // --- DELETE BY VALUE ---
        // To remove by value, use .remove(). Passing Integer.valueOf ensures it removes the object, not the index.
        list.remove(Integer.valueOf(50)); 
        
        // --- READ (Displaying the list) ---
        System.out.println("Current List: " + list); // Prints cleanly: [20, 5, 100, 1]

        // --- READ (Get specific element) ---
        System.out.println("Element at index 1: " + list.get(1)); // Output: 5


        // --- UTILITIES (Size and Empty checks) ---
        int size = list.size();
        boolean isEmpty = list.isEmpty();
        System.out.println("List Size: " + size + " | Is Empty? " + isEmpty);

        
        // --- SEARCHING (Uncommented and working) ---
        boolean exists = list.contains(100);
        int index1 = list.indexOf(100);
        System.out.println("Does 100 exist? " + exists + " at index: " + index1);

        // Final print
        System.out.println("Final List: " + list);
    }
}