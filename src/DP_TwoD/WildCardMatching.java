package DP_TwoD;

import java.util.Arrays;

public class WildCardMatching {
    public static boolean isMatch(String s, String p) {
        int[][]dp=new int[s.length()][p.length()];
        for (int[]i:dp){
            Arrays.fill(i,-1);
        }
        return check(s,p,s.length()-1,p.length()-1,dp);
    }
    public static boolean check(String s,String p,int i,int j,int[][]dp){
        if(j<0 && i<0)
            return true;
        if(j<0 && i>=0)
            return false;
        if(i<0 && j>=0)
        {
            while (j>=0){
                if(p.charAt(j)!='*')
                    return false;
                j--;
            }
            return true;
        }
        if(dp[i][j]!=-1)
        {
            if(dp[i][j]==1)
                return true;
            else
                return false;
        }
        if(s.charAt(i)==p.charAt(j)|| p.charAt(j)=='?') {
            boolean c=check(s, p, i - 1, j - 1, dp);
            dp[i][j]=c?1:0;
            return c;
        }if(p.charAt(j)=='*'){
            boolean c=check(s,p,i,j-1,dp)||check(s,p,i-1,j,dp);
            dp[i][j]=c?1:0;
            return c;
        }
        return false;
    }
    public static void main(String[]args){
        boolean a=isMatch("aa","a");
        System.out.println(a);
    }
}
