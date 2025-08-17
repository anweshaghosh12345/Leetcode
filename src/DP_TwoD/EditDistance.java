package DP_TwoD;

import java.util.Arrays;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int[][]dp=new int[word1.length()][word2.length()];
        for (int[] i:dp){
            Arrays.fill(i,-1);
        }
        return calculate(word1,word2,word1.length()-1,word2.length()-1,dp);
    }
    public int calculate(String w1,String w2,int i,int j,int[][]dp){
        if(i<0)
            return j+1;
        if(j<0)
            return i+1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(w1.charAt(i)==w2.charAt(j)){
            return dp[i][j]=calculate(w1, w2,i-1,j-1, dp);
        }
        else {
            return dp[i][j]=Math.min(1 + calculate(w1, w2, i - 1, j, dp),
                    Math.min(1+calculate(w1,w2,i-1,j-1, dp),
                            1+calculate(w1,w2,i,j-1, dp)));
        }
    }

}
