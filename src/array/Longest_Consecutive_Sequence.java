package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        Arrays.sort(nums);
        int len=1;
        int c=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                if(nums[i]==(nums[i-1]+1))
                    c++;
                else{
                    len=Math.max(len,c);
                    c=1;
                }
            }
        }
        return Math.max(len,c);
    }
}