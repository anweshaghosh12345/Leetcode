package DP_TwoD;

import java.util.Arrays;

public class MinInsertionStepForPalimdrom {
    public int minInsertions(String s) {
        char[]s1=s.toCharArray();
        char[]s2=new char[s.length()];
        int k=s.length()-1;
        for (char c:s1){
            s2[k]=c;
            k--;
        }
        int[][]dp=new int[s.length()][s.length()];
        for (int[]i:dp){
            Arrays.fill(i,-1);
        }
        int c=insertions(0,0,s1,s2,dp);
        return s.length()-c;
    }
    public int insertions( int i,int j,char[]s1,char[]s2,int[][]dp){
        if(i==s1.length|| j==s2.length)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s1[i]==s2[j])
            return 1+ insertions(i+1,j+1,s1,s2, dp);
        return dp[i][j]=Math.max(insertions(i+1,j,s1,s2, dp),insertions(i,j+1,s1,s2, dp));
    }
}
