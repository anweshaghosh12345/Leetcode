package DP_TwoD;

import java.util.Arrays;

public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        int [][]dp=new int[m+1][n+1];
        for (int[]row:dp){
            Arrays.fill(row,-1);
        }
        return paths(grid,0,0,m,n,dp);
    }
    public static int paths(int[][]grid,int i,int j,int m,
                            int n,int[][]dp){

        if(i==m-1 && j==n-1)
            return grid[m-1][n-1];
        if(i>m-1 || j>n-1)
        {
            return (int) Math.pow(10, 9);
        }
        if(dp[i][j]!=-1)
            return dp[i][j];
        int down=grid[i][j]+paths(grid,i,j+1,m,n,dp);
        int right=grid[i][j]+paths(grid,i+1,j,m,n,dp);

        return dp[i][j]=Math.min(down,right);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,1},{1,5,1},{4,2,1}
        };
        int result = minPathSum(matrix);
        System.out.println("minpath : " + result);
    }
}
