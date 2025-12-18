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
            maxR=Math.max(maxR,i+nums[i]);
        }
        return true;
    }
}