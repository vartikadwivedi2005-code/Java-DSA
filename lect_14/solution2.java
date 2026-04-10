import java.util.*;

class Solution2 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int count = 0;
        int ans = 0;
        
        for (int i : nums) {  // Changed from 'arr' to 'nums'
            if (count == 0) {
                ans = i;
            }
            if (i == ans) {
                count++;
            } else {
                count--;
            }
        }
        
        System.out.println("Majority element: " + ans);
    }
}