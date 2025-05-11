package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class House_Robbers_2 {
    public static int rob(int[] nums) {
        int n= nums.length;
        if(n==1) {
            return nums[0];
        }
        if(n==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        if(n==3){
            int max=Math.max(nums[0],nums[1] );
            return Math.max(max,nums[2]);
        }


        ArrayList<Integer>temp1=new ArrayList<>();
        ArrayList <Integer> temp2=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(i!=0){
                temp1.add(nums[i]);
            }
            if(i!=n-1){
                temp2.add(nums[i]);
            }
        }
        int[] dp1=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp1[i]=-1;
        }
        int[] dp2=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp2[i] = -1;
        }
        return Math.max(house(0,temp1,-1,dp1),
                house(0,temp2,-1,dp2));
    }
    public static int house(int index, ArrayList<Integer> nums, int prev, int[]dp){
        int take=0;
        int notTake=0;

        if(index>=nums.size())
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        if(prev==-1 || prev<=index-2) {
            take = nums.get(index) + house(index + 2, nums, index,dp);
        }
        notTake = house(index + 1, nums, prev,dp);

        return dp[index]=Math.max(take,notTake);

    }

    public static void main(String[] args){
        int[]nums=new int[]{200,3,140,20,10};
        System.out.println("money :" + rob(nums));
    }
}
