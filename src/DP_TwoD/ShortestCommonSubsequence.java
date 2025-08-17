package DP_TwoD;

import java.util.ArrayList;

public class ShortestCommonSubsequence {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int[][]dp=new int[str1.length()+1][str2.length()+1];
        for (int i = 0; i <=str1.length() ; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i <=str2.length() ; i++) {
            dp[0][i]=0;
        }
        for (int k = 1; k <=str1.length() ; k++) {
            for (int l = 1; l <= str2.length(); l++) {
                if(str1.charAt(k-1)==str2.charAt(l-1))
                {
                    dp[k][l]=1+dp[k-1][l-1];
                }
                else
                    dp[k][l]=Math.max(dp[k-1][l],dp[k][l-1]);
            }
        }

        int i = str1.length();
        int j = str2.length();

        String ans = "";

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                ans += str1.charAt(i-1);
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                ans += str1.charAt(i-1);
                i--;
            } else {
                ans += str2.charAt(j-1);
                j--;
            }
        }

        while(i>0){
            ans += str1.charAt(i-1);
            i--;
        }
        while(j>0){
            ans += str2.charAt(j-1);
            j--;
        }

        String ans2=new StringBuilder(ans).reverse().toString();

        return ans2;
    }
}
