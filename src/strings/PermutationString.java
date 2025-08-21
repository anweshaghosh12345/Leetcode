package strings;

import java.util.Arrays;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        char[] ar1=s1.toCharArray();
        Arrays.sort(ar1);
        char[] ar2=s2.toCharArray();
        int n=ar1.length;
        int m=ar2.length;
        if(n>m)
            return false;
        for (int i = 0; i <=m-n ; i++) {
            char[]ar=s2.substring(i,i+n).toCharArray();
            Arrays.sort(ar);
            if(Arrays.equals(ar, ar1))
                return true;
        }
        return false;
    }
}
