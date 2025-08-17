package DP_TwoD;

import java.util.Arrays;

public class DistinctSubsequences {
    public static int numDistinct(String s, String t) {
        int[][]dp=new int[s.length()][s.length()];
        for (int[] i:dp){
            Arrays.fill(i,-1);
        }
        return matching(s,t,0,0,dp);
    }
    static int prime = (int) (Math.pow(10, 9) + 7);
    public static int matching(String s,String t,int i, int j,int[][]dp){
        if(j>=t.length())
            return 1;
        if(i>=s.length())
            return 0;

        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i)==t.charAt(j)) {

            return dp[i][j]=matching(s, t, i + 1, j + 1,dp )+matching(s, t, i + 1, j, dp);
        }
        else
            return dp[i][j]=matching(s,t,i+1,j,dp );
    }
}
