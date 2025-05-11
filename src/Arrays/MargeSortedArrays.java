package Arrays;

import java.util.Arrays;

public class MargeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for (int i = m; i <nums1.length ; i++) {
            nums1[i]=nums2[k];
            k++;
        }

        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String []args){
        int[]nums1=new int[]{1,2,3,0,0,0};
        int[]nums2=new int[]{2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
