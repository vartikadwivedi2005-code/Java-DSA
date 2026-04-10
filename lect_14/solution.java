//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times.
//  You may assume that the majority element always exists in the array.

import java.util.*;

class SolutionDemo {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3}; // Example input
        int result = majorityElement(nums);
        System.out.println("Majority element: " + result);
    }
    
    // Method to find majority element
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > nums.length / 2) {
                return i;
            }
        }
        
        return -1; // Should never reach here for valid majority element input
    }
}