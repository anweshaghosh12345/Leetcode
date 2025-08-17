package DP_TwoD;

import java.util.Arrays;

public class TargetSum {
    public static int findTargetSumWays(int[] num, int tar) {
        int sum=0;
        for (int s:num)
            sum+=s;
        int s2=(sum-tar)/2;

        if((sum-tar)%2==1)
            return 0;
        if(sum-tar<0)
            return 0;

        int[][]dp=new int[num.length][s2+1];
        for (int[]i:dp)
            Arrays.fill(i,-1);
        return countWays(0,num,s2,dp);
    }
    public static int countWays(int i, int[] ar, int tar,int[][]dp){
        if (i ==ar.length-1 ) {
            if (tar == 0 && ar[ar.length-1] == 0)
                return 2;
            if (tar == 0 || tar == ar[ar.length-1])
                return 1;
            return 0;
        }
        if(dp[i][tar]!=-1)
            return dp[i][tar];

        int nottake =countWays(i+1,ar,tar, dp);
        int take =0;
        if(tar>=ar[i]){
            take =countWays(i+1,ar,tar-ar[i], dp);
        }

        return nottake + take;
    }

    public static void main(String[] args){
        int ar[] =new int[]{1, 2, 3, 1};
        System.out.println(findTargetSumWays(ar,3));
    }
}
