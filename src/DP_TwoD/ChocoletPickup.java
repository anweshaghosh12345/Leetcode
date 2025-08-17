package DP_TwoD;

import java.util.Arrays;

public class ChocoletPickup {
    public static int maximumChocolates(int r, int c, int[][] grid) {
        // Write your code here.
        int[][][] dp=new int[r][c][c];
        for (int row1[][] : dp) {
            for (int row2[] : row1) {
                Arrays.fill(row2, -1);
            }
        }
        return maxChocolate(0,0,grid[0].length-1,grid,dp);
    }
    public static int maxChocolate(int i,int j1,int j2,int[][]ar,int[][][]dp){
        if(j1<0||j1>=ar[0].length || j2<0 || j2>=ar[0].length)
            return (int)Math.pow(-10,9);
        if(i==ar.length-1)
        {
            if(j1!=j2){
                return (ar[i][j1]+ar[i][j2]);
            }
            else
                return (ar[i][j1]);
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }

        int maxi=Integer.MIN_VALUE;
        for (int j = -1; j <=1; j++) {
            int ans;
            for (int k = -1;k<=1 ; k++) {
                if(j1==j2){
                    ans=ar[i][j1]+maxChocolate(i+1,j1+j,j2+k,ar, dp);
                }
                else {
                    ans=ar[i][j1]+ar[i][j2]+maxChocolate(i+1,j1+j,j2+k,ar, dp);
                }
                maxi=Math.max(maxi,ans);
            }

        }
        return dp[i][j1][j2]=maxi;

    }
}
