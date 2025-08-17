package DP_TwoD;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonSubsequences {
    public static int longestCommonSubsequence(String s1, String s2) {
        int[][]dp1=new int[s1.length()+1][s2.length()+1];
        for (int[] i:dp1)
        Arrays.fill(i,-1);
        ArrayList<Character> ans=new ArrayList<>();
        int c=commonSubsequence(0,0,s1.length(),s2.length(),s1,s2,dp1,ans);
        for (int[] i:dp1)
            System.out.println(Arrays.toString(i));
        System.out.println(ans);
        return c;
    }
    public static int commonSubsequence(int i1,int i2,int n1,int n2,String s1,
                                        String s2,int[][]dp1,ArrayList<Character>ans){
        if(i1==n1 || i2==n2)
            return 0;
        if(dp1[i1][i2]!=-1)
            return dp1[i1][i2];
        if(s1.charAt(i1)==s2.charAt(i2)) {
            ans.add(s1.charAt(i1));
            return 1 + (commonSubsequence(i1 + 1, i2 + 1, n1, n2, s1, s2, dp1, ans));
        }
        return dp1[i1][i2]=Math.max(commonSubsequence(i1+1,i2,n1,n2,s1,s2,dp1,ans),
                commonSubsequence(i1,i2+1,n1,n2,s1,s2,dp1,ans));
    }
    public static void main(String arg[]){
        System.out.println(longestCommonSubsequence("abcde","ace"));
    }
}
//public static int longestCommonSubsequence(String s1, String s2) {
//    char[] a1=s1.toCharArray();
//    ArrayList<ArrayList<Character>> arr=new ArrayList<>();
//    ArrayList<Character>temp1=new ArrayList<>();
//    char[] dp1=new char[a1.length];
//    for (int i = 0; i < a1.length; i++) {
//        dp1[i]='1';
//    }
//    commonSubsequence(0,a1,arr,temp1,dp1);
//    System.out.println(arr);
//    char[]a2=s2.toCharArray();
//    ArrayList<ArrayList<Character>> arr1=new ArrayList<>();
//    ArrayList<Character>temp2=new ArrayList<>();
//    char[] dp2=new char[a1.length];
//    for (int i = 0; i < a1.length; i++) {
//        dp2[i]='1';
//    }
//    commonSubsequence(0,a2,arr1,temp2,dp2);
//    System.out.println(arr1);
//    int c=0;
//    if(arr.size()>=arr1.size()){
//        for (ArrayList<Character> characterArrayList : arr) {
//            for (ArrayList<Character> characters : arr1) {
//                if (characterArrayList.equals(characters)) {
//                    c = Math.max(c, characterArrayList.size());
//                }
//            }
//        }
//    }
//    else {
//        for (ArrayList<Character> characterArrayList : arr1) {
//            for (ArrayList<Character> characters : arr) {
//                if (characterArrayList.equals(characters)) {
//                    c = Math.max(c, characterArrayList.size());
//                }
//            }
//        }
//    }
//
//    return c;
//}
//public static void commonSubsequence(int i, char[] ar,
//                                     ArrayList<ArrayList<Character>>ans,
//                                     ArrayList<Character>temp,char[]dp){
//
//    if(i>=ar.length) {
//        ans.add(new ArrayList<>(temp));
//        return;
//    }
//    if(dp[i]!='1'){
//        ans.add(new ArrayList<>(temp));
//        return;
//    }
//    temp.add(ar[i]);
//    ans.add(temp);
//    commonSubsequence(i+1,ar,ans,temp, dp);
//    temp.remove(temp.size()-1);
//    commonSubsequence(i+1,ar,ans,temp, dp);
//
//}
