package DP;

import java.util.ArrayList;

public class Clibling_Staors {
    public int climbStairs(int n) {

        int[] dp=new int[n+1];

        return ways(n,dp);
    }
    public static int ways(int n, int[]dp){
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        else
        {
            dp[n]=ways(n-1,dp)+ways(n-2,dp);
            return dp[n];
        }
    }
}
