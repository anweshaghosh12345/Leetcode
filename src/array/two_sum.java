package array;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int k= nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+nums[k-1]==target) {
                arr[0] = i;
                arr[1] = k - 1;
            }
            k--;
        }
        return arr;
    }
}
