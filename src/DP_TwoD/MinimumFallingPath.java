package DP_TwoD;

import java.util.Arrays;

public class MinimumFallingPath {
    public static int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int[][]dp=new int[matrix.length+1][matrix.length+1];
        for (int[] ar:dp){
            Arrays.fill(ar,(int)Math.pow(10,9));
        }
        for (int i = 0; i <matrix[0].length ; i++) {
            min=Math.min(min,minimumFall(0,i,matrix,dp));
        }
        return min;
    }
    public static int minimumFall(int r,int c,int[][]matrix,int[][]dp){
        if (c < 0 || c >= matrix[0].length)
            return (int) Math.pow(10, 9);
        if(r==matrix.length-1)
            return matrix[r][c];
        int left=Integer.MAX_VALUE;
        int below=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(dp[r][c]!=(int)Math.pow(10,9))
            return dp[r][c];
        if(c!=0){
            left=matrix[r][c]+minimumFall(r+1,c-1,matrix,dp);
        }
        if (c<matrix[r].length-1) {
            right=matrix[r][c]+minimumFall(r+1,c+1,matrix,dp);
        }
        below=matrix[r][c]+minimumFall(r+1,c,matrix,dp);
        return dp[r][c]=Math.min(left,Math.min(right,below));
    }
}
