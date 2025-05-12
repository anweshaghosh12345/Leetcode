package DP_TwoD;

import java.util.Arrays;

public class UniquePath {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m+1][n+1];
        for (int[]row:dp){
            Arrays.fill(row,-1);
        }
       return findPaths(0,0,m,n,dp);
    }
    public int findPaths(int i,int j,int m,int n,int[][]dp){
        if(i==m-1&& j==n-1)
            return 1;
        if(i>m || j>n)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int down=findPaths(i+1,j,m,n,dp);
        int right=findPaths(i,j+1,m,n,dp);
        return dp[i][j]=down+right;
    }
}
