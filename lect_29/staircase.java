package lect_29;

public class staircase {
   public static void main(String[] args) {
     
        int target = 4;
        System.out.println("Total ways to reach " + target + ": " + countWays(target));
    }

    public static int countWays(int n) {
        // Base case: If we hit exactly 0, we found a valid way
        if (n == 0) return 1;
        
        // If we go below 0, this path is invalid
        if (n < 0) return 0;

        // Recursive step: Try adding 1 and try adding 2
        return countWays(n - 1) + countWays(n - 2);
    }
}
