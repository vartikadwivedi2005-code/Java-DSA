package lect_29;

import java.util.Arrays;

public class staircase3 {
    static int count(int[] arr, int i, int[] dp){
        if(i>=arr.length)
            return 0;
        if(dp[i] != -1)
            return dp[i];
        int x = arr[i] + count(arr, i+2, dp);
        int y = count(arr, i+1, dp);
        dp[i] = Math.max(x, y);
        return dp[i];
    }
    public static void main(String[] args){
        int arr[] = {2,1,4,9};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        int i = 0;
        System.out.println(count(arr, i, dp));
    }
}
