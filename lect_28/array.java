package lect_28;

import java.util.Arrays;

public class array {
    static int count(int n , int[] dp){
        if(n==0)
            return 0;
        if(dp[n] != -1)
            return dp[n];
        dp[n] = 1 + count(n/10, dp);
        return dp[n];

    }
    public static void main(String[] args){
        int n = 1234;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(count(n, dp));
    }
}
