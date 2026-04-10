//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times.
//  You may assume that the majority element always exists in the array.

import java.util.*;
class Solution{
    public int majorityElement(int[] nums){
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
        map.put(i,map.getOrDefault(i,0) + 1);    //put-> insert key-value pair
        if(map.get(i)>nums.length/2){
            return i;
             }
            }  
            return -1;     
    }

    public char[] canJump(int[] nums1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canJump'");
    }
} 