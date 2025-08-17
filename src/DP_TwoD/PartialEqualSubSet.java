package DP_TwoD;

import java.util.Arrays;

public class PartialEqualSubSet {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }

        if(sum%2==0) {
            int[][]dp=new int[nums.length][(sum/2)+1];
            for (int[]i:dp){
                Arrays.fill(i,-1);
            }
            return half(0, sum / 2, nums,dp);
        }
        else
            return false;
    }
    public boolean half(int i,int target,int[]ar,int [][]dp){
        if(i==ar.length-1)
        {
            return ar[i] == target;
        }
        if(target==0)
            return true;
        if(dp[i][target]!=-1){
            if(dp[i][target]==1)
                return true;
            else
                return false;
        }
        boolean nottake=half(i+1,target,ar, dp);
        boolean take=false;
        if(target>=ar[i]){
            take=half(i+1,target-ar[i],ar, dp);
        }
        dp[i][target]=take||nottake?1:0;
        return take||nottake;
    }
}
