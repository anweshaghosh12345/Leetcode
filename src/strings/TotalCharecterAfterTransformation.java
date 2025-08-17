package strings;

import java.util.Arrays;
import java.util.HashMap;

public class TotalCharecterAfterTransformation {
    public static int lengthAfterTransformations(String s, int t) {
        int[] ar=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            int j=s.charAt(i)-'a';
            ar[j]= ar[j]+1;
            System.out.println(j);
        }
//        System.out.println(Arrays.toString(ar));
        while (t!=0){
            for (int i = 0; i < ar.length; i++) {
                if(ar[i]!=0) {
                    ar[i] = ar[i] - 1;

                    if (i != ar.length - 1) {
                        ar[i + 1] = ar[i + 1] + 1;
                    } else {
                        ar[0] = ar[0] + 1;
                        ar[1] = ar[1] + 1;
                    }
                }
            }
            t--;
            System.out.println(Arrays.toString(ar));
        }

        int sum=0;
        for (int i = 0; i <ar.length ; i++) {

            if(ar[i]!=0)
                sum+=ar[i];
            sum=(int) (sum%(Math.pow(10,9)+7));
        }
        System.out.println(Arrays.toString(ar));
        return (int) (sum%(Math.pow(10,9)+7));
    }
    public static void main(String[] args){
        System.out.println(lengthAfterTransformations("k",2));

    }
}
