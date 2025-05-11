package DP;

public class House_Robber {
    public static int rob(int[] nums) {
        int[] dp=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i]=-1;
        }
        return house(0,nums,-1,dp);
    }
    public static int house(int index, int[] nums, int prev,int[]dp){
        int take=0;
        int notTake=0;
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        if(index>=nums.length)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        if(prev==-1 || prev<=index-2) {
            System.out.println("take :"+index+" "+nums[index]);
            take = nums[index] + house(index + 2, nums, index,dp);
        }

            System.out.println("not take :"+index+" "+nums[index]);
            notTake = 0 + house(index + 1, nums, prev,dp);

        return dp[index]=Math.max(take,notTake);
    }

    public static void main(String[] args){
        int[]nums=new int[]{2,1,1,2};
        System.out.println("money :" + rob(nums));
    }
}
