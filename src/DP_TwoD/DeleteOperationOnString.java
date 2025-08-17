package DP_TwoD;

import java.util.Arrays;

public class DeleteOperationOnString {
    public int minDistance(String word1, String word2) {
        int[][]dp=new int[word1.length()][word2.length()];
        for (int[]i:dp){
            Arrays.fill(i,-1);
        }
        return (word1.length()+word2.length())-distance(0,0,word1,word2,dp);
    }
    public int distance(int i,int j,String word1,String word2,int[][]dp){
        if(i==word1.length()|| j==word2.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            return 2+distance(i+1,j+1,word1,word2,dp);
        }
        return dp[i][j]=Math.max(distance(i+1,j,word1,word2,dp),
                distance(i,j+1,word1,word2,dp));
    }
}
