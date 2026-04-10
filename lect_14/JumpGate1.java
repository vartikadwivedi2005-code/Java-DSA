import java.util.*;
class JumpGate2{
     public static void main(String[] args) {
        int nums[] = {2,3,1,1,4}; // Example input
         int lastPos = nums.length - 1;
        System.out.println("Jump Gate: " + lastPos); 
    }
     public boolean canJump(int[] nums) {
        int maxR=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxR){
                return false;
            }
            maxR=Math.max(maxR,i+nums[i]);  //maxR: A variable that stores the maximum reachable index so far
            //what the statement does - updates maxR to be the maximum between:
                                   // 1) The current maximum reach (maxR)
                                   // 2) What we can reach if we jump from the current position i (i + nums[i]
        }
        return true;
    }
}