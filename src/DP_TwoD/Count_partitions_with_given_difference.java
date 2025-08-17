package DP_TwoD;

import java.util.Arrays;

public class Count_partitions_with_given_difference {
    public static int countPartitions(int n, int diff, int[] arr) {
        int totalsum=0;
        for (int i:arr)
            totalsum+=i;
        if(totalsum-diff< 0 || (totalsum-diff)%2!=0)
            return 0;
        int[][]dp=new int[arr.length][(totalsum-diff)/2+1];
        for (int[]i:dp)
            Arrays.fill(i,-1);
        return countWays(0,arr,(totalsum-diff)/2,dp);
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
    public static void main(String[]args){
        int[]ar=new int[]{1, 2, 3, 4};
        int c=countPartitions(4,2,ar);
        System.out.println(c);
    }
}
