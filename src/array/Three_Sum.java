package array;
import java.util.*;

public class Three_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
           if(i>0 && nums[i]==nums[i-1])
//               go to the next step
               continue;
           int j=i+1;
           int k=nums.length-1;
           while (j<k){
               int sum=nums[i]+nums[j]+nums[k];
               if(sum<0)
                   j++;
               else if (sum > 0) {
                   k--;
               }
               else {
                   ArrayList<Integer>ar1=new ArrayList<>();
                   ar1.add(nums[i]);
                   ar1.add(nums[j]);
                   ar1.add(nums[k]);
                       ans.add(ar1);
                   j++;
                   k--;
                   while (j<k && nums[j]==nums[j-1])
                       j++;
                   while (j<k && nums[k]==nums[k+1])
                       k--;
               }
           }

        }

        return ans;
    }
}
