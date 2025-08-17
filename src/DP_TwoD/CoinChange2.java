package DP_TwoD;

import java.util.Arrays;

public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[][]dp=new int[coins.length][amount+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return coinways(0,coins,amount,dp);
    }
    public int coinways(int i,int[]coins,int amount,int[][]dp){

        if(i==coins.length-1){
            if(amount%coins[i]==0)
                return 1;
            else
                return 0;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }

        int nottake=coinways(i+1,coins,amount,dp);
        int take=0;
        if(amount>=coins[i]){
            take=coinways(i,coins,amount-coins[i],dp);
        }
        return dp[i][amount]=take+nottake;
    }
}
