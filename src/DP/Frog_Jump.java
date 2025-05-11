package DP;

public class Frog_Jump {
    public static int frogJump(int[] heights) {
        int[]dp=new int[heights.length];
        for (int i = 0; i < dp.length ; i++) {
            dp[i]=-1;
        }
        return steps(0,heights,dp);
    }
    public static int steps(int i,int[]heights,int[]dp){
        int onetake=0;
        int twoTake =Integer.MAX_VALUE;
        if(dp[i]!=-1)
            return dp[i];
        if(i>=heights.length-1)
            return 0;

        onetake=Math.abs(heights[i]-heights[i+1])+steps(i+1,heights,dp);

        if(i< heights.length-2) {
            twoTake = Math.abs(heights[i]-heights[i+2])+steps(i + 2, heights,dp);
        }
        return dp[i]=Math.min(onetake, twoTake);
    }

    public static void main(String[] args){
        int[] heights=new int[]{7, 5, 1, 2, 6};
        System.out.println(frogJump(heights));
    }
}
