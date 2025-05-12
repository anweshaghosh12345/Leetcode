package DP_TwoD;

import java.util.Arrays;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length-1;
        int n=obstacleGrid[0].length-1;
        int [][]dp=new int[m+2][n+2];
        for (int[]row:dp){
            Arrays.fill(row,-1);
        }
        return findPaths(0,0,m,n,obstacleGrid,dp);
    }
    public int findPaths(int i,int j,int m,int n,int[][]obstacleGrid,int[][]dp){
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        if(i>m || j>n ||obstacleGrid[i][j]==1)
            return 0;

        if(i==m && j==n)
            return 1;

        int down=findPaths(i+1,j,m,n,obstacleGrid,dp);
        int right=findPaths(i,j+1,m,n,obstacleGrid,dp);
        return dp[i][j]=down+right;
    }
}