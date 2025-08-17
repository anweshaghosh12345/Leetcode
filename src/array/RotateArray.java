package array;

public class RotateArray {
    public void rotate(int[] nums, int k) {
       k=k% nums.length;
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
    }
    public void swap(int[] nums,int strt,int end){
        while (strt<end){
            int temp=nums[strt];
            nums[strt]=nums[end];
            nums[end]=temp;
            strt++;
            end--;
        }
    }
}