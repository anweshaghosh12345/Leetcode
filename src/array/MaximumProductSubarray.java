package array;

public class MaximumProductSubarray {
    int maxProduct(int[] arr) {
        // code here
        int max=arr[0];
        int pref=1;
        int suff=1;
        for(int i=0;i<arr.length;i++){
            if(pref==0)
                pref=1;
            if(suff==0)
                suff=1;
            pref=pref*arr[i];
            suff=suff*arr[arr.length-1-i];
            max=Math.max(max,Math.max(pref,suff));
        }
        return max;
    }
}
