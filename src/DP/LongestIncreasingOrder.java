package DP;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingOrder {
    public static int lengthOfLIS(int[] nums) {
       int prev=Integer.MIN_VALUE;
       return lisRecursion(nums,0,prev);
    }
    public static int lisRecursion(int[]nums, int index,int prev){
        int counter=0;
        if(index==nums.length)
        {
            return 0;
        }
        counter=0+lisRecursion(nums,index+1,prev);
            if(prev==-1 ||nums[index]>prev) {
                counter = Math.max(counter, 1 + lisRecursion(nums, index + 1, nums[index]));
            }
        return counter;
    }

    public static void main(String[] args){
       int[]nums=new int[]{2,1,5,3};
        System.out.println("lengthOfLIS :" + lengthOfLIS(nums));


    }
}
