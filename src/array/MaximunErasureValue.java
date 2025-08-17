package array;

import java.util.HashSet;

public class MaximunErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0,max=0,i=0,j=0;
        HashSet<Integer> hs=new HashSet<>();
        while (i<nums.length && j<nums.length){
            if(hs.contains(nums[j])){
                hs.remove(nums[i]);
                sum=sum-nums[i];
                i++;
            }else {
                sum = sum + nums[j];
                max = Math.max(sum, max);
                hs.add(nums[j]);
                j++;
            }
        }
        return max;
    }
}
