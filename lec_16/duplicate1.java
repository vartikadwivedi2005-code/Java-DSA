//Given an integer array nums and an integer k, return true if there 
// are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

import java.util.*;
class Duplicate  {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    
    public static void main(String[] args) {
       // int[] nums = {1,2,3,1,2,3};
        //int[] nums = {1,2,3,1};
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k)); // true
    }
}

//nums[0] = 1, nums[3] = 1 → equal values.
//abs(0 - 3) = 3, which is ≤ k (3) → ✅
//Return true.

