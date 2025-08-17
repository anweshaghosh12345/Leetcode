package Recursion;

import java.util.*;

public class subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ar=new ArrayList<>();
        subsets(nums,ans,0,ar);
        return ans;
    }
    public void subsets(int[] nums,List<List<Integer>>ans,int i,ArrayList<Integer>ar){
        if(!ans.contains(ar))
        ans.add(new ArrayList<>(ar));
        for (int j = i; j < nums.length ; j++) {
            ar.add(nums[j]);
            subsets(nums,ans,j+1,ar);
            ar.remove(ar.size()-1);
        }
    }
}
