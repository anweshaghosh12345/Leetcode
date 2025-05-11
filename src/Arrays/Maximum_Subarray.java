package Arrays;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j < nums.length; j++) {
                maxSum=Math.max(maxSum,sumOfAll(i,j,nums));
            }
        }
        return maxSum;
    }
    public int sumOfAll(int start,int end,int[]nums){
        int sum=0;
        for (int i = start; i <=end ; i++) {
            sum=sum+nums[i];
        }
        return sum;
    }
}
