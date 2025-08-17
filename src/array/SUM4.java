package array;
import java.util.*;
public class SUM4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                int sum=-nums[i]-nums[j];
                int strt=j+1;
                int end= nums.length-1;
                while (strt<end){
                    int sum2=nums[strt]+nums[end];
                    if(sum2==sum){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[strt],nums[end]));
                    }
                    while (strt<end && nums[strt]==nums[strt+1])
                        strt++;
                    while (strt<end && nums[end]==nums[end-1])
                        end--;
                    strt++;
                    end--;
                }
            }
        }
        return ans;
    }
}
