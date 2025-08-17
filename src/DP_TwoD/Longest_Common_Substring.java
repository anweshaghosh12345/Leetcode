package DP_TwoD;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Common_Substring {
    public static int longestCommonSubset(String s1, String s2) {
        int[][] dp1 = new int[s1.length() + 1][s2.length() + 1];
        int maxlen=Integer.MIN_VALUE;
        int val=0;
        for (int i = 1; i <=s1.length(); i++) {
            for (int j = 1; j <=s2.length() ; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                  val=1+dp1[i-1][j-1];
                  maxlen=Math.max(maxlen,val);
                  dp1[i][j]=val;
                }
                else {
                    dp1[i][j]=0;
                    val=0;
                }

            }
        }
        return maxlen;
    }

    public static void main(String arg[]) {
        System.out.println(longestCommonSubset("abcde", "abcdp"));
    }
}