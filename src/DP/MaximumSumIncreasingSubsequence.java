package DP;

import java.util.Arrays;

public class MaximumSumIncreasingSubsequence {
    public static int maxSum(int[] nums) {
        int dp[][]=new int[nums.length+1][nums.length+1];
        for (int[] i:dp)
            Arrays.fill(i,-1);
        return lisRecursion(nums,0,-1,dp);
    }

    private static int lisRecursion(int[] nums, int i, int prev,int[][]dp) {
        int notTake=0,take=0;
        if(i== nums.length)
            return 0;
        if(dp[i][prev+1]!=-1)
            return dp[i][prev+1];

        notTake=0+lisRecursion(nums,i+1,prev,dp);
        if(prev==-1 || nums[prev]<nums[i]){
            take=nums[i]+lisRecursion(nums,i+1,i,dp);
        }

        return dp[i][prev+1]=Math.max(notTake,take);
    }
}
