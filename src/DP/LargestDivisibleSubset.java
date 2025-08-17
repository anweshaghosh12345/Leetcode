package DP;
import java.util.*;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        Arrays.sort(arr);
        List<Integer> ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        int[][]dp=new int[arr.length+1][arr.length+1];
        for (int[]i:dp){
            Arrays.fill(dp,-1);
        }
        subSet(0,-1,arr,curr,ans);
    return ans;
    }
    public void subSet(int i, int prev, int []arr,List<Integer>curr, List<Integer>ans){
        if(i==arr.length) {
            if(curr.size()>=ans.size()){
                ans.clear();
                ans.addAll(curr);
            }
            return;
        }
        if(prev==-1|| (arr[i]%arr[prev]==0 || arr[prev]% arr[i]==0)){
            curr.add(arr[i]);
            subSet(i+1,i,arr,curr,ans);
            curr.remove(curr.size()-1);
        }
        subSet(i+1,prev,arr,curr,ans);

    }
}
