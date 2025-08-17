public class Longest_Subarray_with_Sum_K {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int len=-1;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                sum+=arr[j];
                if(sum==k){
                    len=Math.max(len,j-i);
                }
            }
        }
        return len;
    }
}