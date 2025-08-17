package DP_TwoD;

import java.util.Arrays;

public class CountSubWithTarget {
    public static int findWays(int num[], int tar) {
        int[][]dp=new int[num.length][tar+1];
        for (int[]i:dp)
            Arrays.fill(i,-1);

        return countWays(0,num,tar,dp);
    }
    public static int countWays(int i, int[] ar, int tar,int[][]dp){
        if(tar==0)
            return 1;
        if(dp[i][tar]!=-1)
            return dp[i][tar];
        if(i== ar.length-1)
        {
            return ar[ar.length-1]==tar?1:0;
        }
        int nottake=countWays(i+1,ar,tar, dp);
        int take=0;
        if(tar>=ar[i]){
            take=countWays(i+1,ar,tar-ar[i], dp);
        }
        return dp[i][tar]=nottake+take;
    }
}
