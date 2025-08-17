package array;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for (int i = 0; i <nums.length ; i++) {
                sum+=nums[i];
                while (sum>=target){
                    min=Math.min(min,i+1-left);
                  sum=sum-nums[left];
                  left++;
                }
            }

        if(min==Integer.MAX_VALUE)
            return 0;
        return min;
    }
}
