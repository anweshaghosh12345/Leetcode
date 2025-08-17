package array;

public class SubArrayLen3 {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]+nums[i+1]==nums[i]/2)
                c++;
        }
        return c;
    }
}
