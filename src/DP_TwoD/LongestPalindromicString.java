package DP_TwoD;

import java.util.Arrays;

public class LongestPalindromicString {
    public int longestPalindromeSubseq(String s) {
        char[] ar1 =s.toCharArray();
        char[] ar2 = new char[ar1.length];
        int j=0;
        for (int i = ar1.length-1; i>=0; i--){
            ar2[j]= ar1[i];
            j++;
        }
        int[][]dp=new int[s.length()][s.length()];
        for (int[] i:dp){
            Arrays.fill(i,-1);
        }
        return palindrome(0,0, ar1, ar2,dp);
    }
    public int palindrome(int i1,int i2,char[]ar1,char[]ar2,int[][]dp){
        if(i1== ar1.length|| i2==ar2.length)
            return 0;
        if(dp[i1][i2]!=-1)
            return dp[i1][i2];
        if(ar1[i1]==ar2[i2]){
            return 1+palindrome(i1+1,i2+1,ar1,ar2,dp);
        }
        return dp[i1][i2]=Math.max(palindrome(i1+1,i2,ar1,ar2,dp),palindrome(i1,i2+1,ar1,ar2,dp));
    }
}
