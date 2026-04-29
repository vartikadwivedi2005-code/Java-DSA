package lect_29;

import java.util.Arrays;

public class staircase2 {
    static int count(int n, int[] dp){
        if(n==1)
            return 0;
        if(dp[n] != -1)
            return dp[n];
        int ans = count(n-1, dp);
        if(n%2==0){
            ans = Math.max(ans, count(n/2, dp));
        }
        if(n%3==0){
            ans = Math.max(ans, count(n/3, dp));
        }
        dp[n] = 1 + ans;
        return dp[n];
    }
    public static void main(String[] args){
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("Total ways to reach " + n + ": " + count(n, dp));
    }
}
