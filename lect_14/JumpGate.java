import java.util.*;
class JumpGate1 {
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4}; // Example input
         int lastPos = nums.length - 1;
        System.out.println("Jump Gate: " + lastPos); 
    }
    public boolean canJump(int[] nums) {
      int lastPos =0;
        // Start from the second last index and move backwards
        for (int i = nums.length - 2; i >= 0; i--) {
            if ( i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        
        return lastPos == 0;
    }
}
