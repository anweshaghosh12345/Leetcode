package array;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int flag=0;
        for (int i:nums){
            if(i!=0) {
                prod *= i;
            }
            else flag++;
        }
        if(flag== nums.length)
            return nums;
        if( flag>1){
            Arrays.fill(nums, 0);
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {

            if(flag != nums.length &&flag!=0 && nums[i]==0){
                nums[i]=prod;
            }
            else if(flag > 0 && nums[i]!=0)
                nums[i]=0;
            else {
                nums[i]=prod/nums[i];
            }
        }
        return nums;
    }
}
