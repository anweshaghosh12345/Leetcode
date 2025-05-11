package DP;

import java.util.Arrays;

public class FrogJumpWithKDistance {
    public static int frogJump(int[] heights, int k) {
        int[] dp = new int[heights.length];
        Arrays.fill(dp, -1);
        return steps(0, k, heights, dp);
    }
    public static int steps(int i, int k, int[] heights, int[] dp) {
        int onetake = 0;
        int kTake = Integer.MAX_VALUE;
        if (dp[i] != -1)
            return dp[i];
        if (i >= heights.length - 1)
            return 0;

        onetake = Math.abs(heights[i] - heights[i + 1]) + steps(i + 1, k,heights, dp);

        if (i < heights.length - k) {
            kTake = Math.abs(heights[i] - heights[i + k]) + steps(i + k,k, heights, dp);
        }
        return dp[i] = Math.min(onetake, kTake);
    }
    public static void main(String[] args){
        int[] heights=new int[]{15, 4, 1, 14, 15};
        int k=3;
        System.out.println(frogJump(heights,k));
    }
}
